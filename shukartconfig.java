/* package com.shu.kart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class shukartconfig {

	@Configuration
	@EnableWebMvc
	@ComponentScan(basePackages = "com.shu.kart")
	public class DemoAppConfig {

		@Bean
		public ViewResolver viewResolver() {

			InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

			viewResolver.setPrefix("/templates");
			viewResolver.setSuffix(".html");

			return viewResolver();
		}

	}

} */
