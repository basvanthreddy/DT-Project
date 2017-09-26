package com.niit.com.NIITEcommerce.ApplicationConfig;

import java.util.*;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.com.NIITEcommerce.Usermodel.User;




@Configuration
@ComponentScan("com.niit.com.NIITEcommerce.*")
@EnableTransactionManagement
public class ApplicationConfig {
	
	
@Autowired
@Bean(name="dataSource")
public DataSource getH2DataSource() {
		System.out.println("Data Source Method");
		 
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		System.out.println("Data Source Created");
		return dataSource;
		
	}

	public Properties getHibernateProperties() {
		System.out.println("Hibernate Properties -Entered");
		Properties hibernate_prop = new Properties();
		hibernate_prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		hibernate_prop.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernate_prop.put("hibernate.show_sql", "true"); // optional
		
		System.out.println("Hibernate Prperty Object Created");
		return hibernate_prop;
	}

	@Autowired
	@Bean(name ="sessionFactory")
	public SessionFactory getSessionFactory() {
		System.out.println("SessionFactory Method-Entered");
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(getH2DataSource());
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(User.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(Category.class);
		SessionFactory sessionfactory = sessionBuilder.buildSessionFactory();
		System.out.println("SessionFactory Object Created");
		return sessionfactory;
	}
	@Bean(name="ProductDao")
	public ProductDao getProductDAO(SessionFactory sessionFactory)
	{
		System.out.println(" product dao");
	return new ProductDaoImpl(sessionFactory);
	}
	@Bean(name="CategoryDao")
	public CategoryDao getCategoryDAO(SessionFactory sessionFactory)
	{
	return new CategoryDaoImpl(sessionFactory);
	}

	@Bean(name="SupplierDao")
	public SupplierDao getSupplierDao(SessionFactory sessionFactory)
	{
	return new SupplierDaoImpl(sessionFactory);
	}
	@Bean(name="UserDao")
	public UserDao getUserDao(SessionFactory sessionFactory)
	{
	return new UserDaoImpl(sessionFactory);
	}

	
	@Autowired
	@Bean(name ="transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		System.out.println("Transaction Manager");
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
}
