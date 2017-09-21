package com.niit.com.NIITEcommerceBackEnd.ApplicationConfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.com.NIITEcommerceBackEnd.model.User;
@Configuration
@EnableTransactionManagement
@ComponentScan("com.niit.com.NIITEcommerceBackEnd.*")
public class ApplicationConfigration {

	@Autowired
	@Bean(name = "dataSource")
	public DataSource getDataSource() {

		System.out.println("this is datasouce method");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		System.out.println("DataSource is Created!");
		return dataSource;

	}

	public Properties getHibernateProperites() { // two methos we are using

		System.out.println("Hibernate properties invoked");
		Properties hib_prop = new Properties();
		hib_prop.setProperty("hibernate.hbm2ddl.auto", "update");

		hib_prop.put("hibernate.show_sql", "true"); // optional

		hib_prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		System.out.println("hibernet property obj is created");
		return hib_prop;

	}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory() {
		System.out.println("SessionFactory Method-Entered");
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(getDataSource());
		sessionBuilder.addProperties(getHibernateProperites());
		sessionBuilder.addAnnotatedClass(User.class);
		SessionFactory sessionfactory = sessionBuilder.buildSessionFactory();

		System.out.println("sessionfactory obj is created");

		return sessionfactory;

	}

	@Bean(name = "transactionManager")
	public HibernateTransactionManager transactionManagergetTransactionManager(SessionFactory sessionfactory) {
		System.out.println("Transaction manager");
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionfactory);
		return transactionManager;

	}

}
