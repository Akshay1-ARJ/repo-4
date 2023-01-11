package com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.AutoWiredConfigruation;
import com.xworkz.spring.things.Bekary;
import com.xworkz.spring.things.HardwareShop;
import com.xworkz.spring.things.Pencil;
import com.xworkz.spring.things.Rubber;
import com.xworkz.spring.things.Software;

public class AutoWiredRunner {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutoWiredConfigruation.class);
		String[] ref = applicationContext.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));

		HardwareShop hardwareShop = applicationContext.getBean(HardwareShop.class);
		System.out.println(hardwareShop);

		Software software = applicationContext.getBean(Software.class);
		System.out.println(software.toString());

		Pencil pencil = applicationContext.getBean(Pencil.class);
		System.out.println(pencil.toString());
		Bekary bekary=applicationContext.getBean(Bekary.class);
		System.out.println(bekary);
		
		
		Rubber rubber=applicationContext.getBean(Rubber.class);
		System.out.println(rubber.toString());
		
  
	}

}
