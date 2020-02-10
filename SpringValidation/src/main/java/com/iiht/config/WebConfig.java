package com.iiht.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@ComponentScan(basePackages= {"com.iiht"})
public class WebConfig extends WebMvcConfigurerAdapter {
	
@Bean
   public InternalResourceViewResolver viewResolver()
   {
	InternalResourceViewResolver InternalResourceViewResolve=new InternalResourceViewResolver();
	InternalResourceViewResolve.setViewClass(JstlView.class);
	InternalResourceViewResolve.setPrefix("/WEB-INF/views/");
	InternalResourceViewResolve.setSuffix(".jsp");
	return InternalResourceViewResolve;
   }

	
}
