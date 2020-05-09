package com.learn.springbootlearn;


import com.learn.springbootlearn.listener.SecondListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLearnApplication.class, args);

		/*SpringApplication springApplication = new SpringApplication(SpringBootLearnApplication.class);
		springApplication.addListeners(new SecondListener());
		springApplication.run();*/
	}

}
