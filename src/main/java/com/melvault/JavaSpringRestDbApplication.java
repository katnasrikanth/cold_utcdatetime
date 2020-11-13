package com.melvault;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.melvault.service.FilesStorageService;

@SpringBootApplication
public class JavaSpringRestDbApplication implements CommandLineRunner  {

	  @Resource
	  FilesStorageService storageService;
	  
	public static void main(String[] args) {
		SpringApplication.run(JavaSpringRestDbApplication.class, args);
	}

	 @Override
	  public void run(String... arg) throws Exception {
		storageService.deleteAll();
	    storageService.init();
	  }
	 
	 
}
