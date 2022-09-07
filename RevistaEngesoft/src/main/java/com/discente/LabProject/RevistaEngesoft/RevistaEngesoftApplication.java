package com.discente.LabProject.RevistaEngesoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;

import javax.sql.DataSource;
import java.sql.Driver;


//@Controller("com.discente.LabProject.RevistaEngesoft.controller")
@SpringBootApplication
		(scanBasePackages = {"com.discente.LabProject.RevistaEngesoft.service", "com.discente.LabProject.RevistaEngesoft.repository","com.discente.LabProject.RevistaEngesoft.controller"})
@ComponentScan(basePackages = {"com.discente.LabProject.RevistaEngesoft.service", "com.discente.LabProject.RevistaEngesoft.repository","com.discente.LabProject.RevistaEngesoft.controller"})
@EntityScan(value = {"com.discente.LabProject.RevistaEngesoft.entity"})
@EnableJpaRepositories(basePackages = "com.discente.LabProject.RevistaEngesoft.repository")

/*
@EnableAutoConfiguration(exclude={HibernateJpaAutoConfiguration.class,
		JpaRepositoriesAutoConfiguration.class,
		DataSourceAutoConfiguration.class})


 */



public class RevistaEngesoftApplication {

	public static void main(String[] args) {
		SpringApplication.run(RevistaEngesoftApplication.class, args);
	}

	@Bean
	public DataSource dataSource ()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/testando?useTimezone=true&serverTimezone=America/Sao_Paulo");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");

		return dataSource;
	}

}
