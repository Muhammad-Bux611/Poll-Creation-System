package com.poll.Configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"com.poll"})
public class Config {
	
	@Bean
	
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver rs = new InternalResourceViewResolver();
		rs.setPrefix("/views/");
		rs.setSuffix(".jsp");
		return rs;
	}
	

	@Bean
	
	public HibernateTemplate getHibernate(SessionFactory sessionFactory) {
		return new HibernateTemplate(sessionFactory);
		
	}
	
	@Bean
	
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(getDataSource());
		sessionFactoryBean.setHibernateProperties(getProperties());
		sessionFactoryBean.setAnnotatedClasses(com.poll.Model.Admin.class, com.poll.Model.User.class
				, com.poll.Model.Question.class,
				com.poll.Model.Vote.class,
				com.poll.Model.Poll.class
				);
		return sessionFactoryBean;
	}
	@Bean
	public Properties getProperties() {
		// TODO Auto-generated method stub
		
		Properties properties = new Properties();
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		return properties;
	}
	@Bean
	public DataSource getDataSource() {
		// TODO Auto-generated method stub
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/pollSystem");
		ds.setUsername("root");
		ds.setPassword("software@muet19");
		return ds;
		
	}
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
	    HibernateTransactionManager transaction = new HibernateTransactionManager();
	    transaction.setSessionFactory(sessionFactory);
	    return transaction;
	}

	
}
