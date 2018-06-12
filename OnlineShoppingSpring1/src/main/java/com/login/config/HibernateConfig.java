package com.login.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="com.login.model")
public class HibernateConfig 
{
	private final static String Database_url = "jdbc:mysql://localhost:3306/onlineshopping" ;
	 private final static String Database_driver ="com.mysql.jdbc.Driver";
	 private final static String Database_dialect = "org.hibernate.dialect.MySQLDialect";
	 private final static String Database_username ="root";
	 private final static String Database_password ="toor";
	 
	 @Bean
	 public DataSource getdataSaurce() 
	 {
		 BasicDataSource ds = new BasicDataSource();
		 ds.setDriverClassName(Database_driver);
		 ds.setUrl(Database_url);
		 ds.setUsername(Database_username);
		 ds.setPassword(Database_password);
		 return ds;
	 }
	 
	 //sessionfactory 
	 @Bean
	 public SessionFactory getsession(DataSource dataSource)
	 {
		 
		 LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		 
		 builder.addProperties(getHibernateProperties());
		 builder.scanPackages("com.login.model");
		 
		 
		 return builder.buildSessionFactory();
	 }
	 
	 //all hibernate properties will appear here
	 private Properties getHibernateProperties() 
	 {
		 Properties properties = new Properties();
		 properties.put("hibernate.dialect", Database_dialect);
		 properties.put("hibernate.show_sql", true);
		 properties.put("hibernate.format_sql", true);
		return properties;
	}

	//transation manger
	 @Bean
	 public HibernateTransactionManager getTransationManager(SessionFactory sessionFactory)
	 {
		 HibernateTransactionManager ht = new HibernateTransactionManager(sessionFactory);
		 return ht;
	 }
}
