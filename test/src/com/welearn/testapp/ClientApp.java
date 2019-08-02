package com.welearn.testapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.welearn.testapp.config.PersistenceJPAConfig;
import com.welearn.testapp.model.Foo;
import com.welearn.testapp.repo.IFooDAO;

public class ClientApp {

	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
		ApplicationContext context = new AnnotationConfigApplicationContext(PersistenceJPAConfig.class);
		IFooDAO fooRepo = (IFooDAO) context.getBean(IFooDAO.class);
		fooRepo.save(new Foo(1, "first name"));
		fooRepo.save(new Foo(2, "second name"));
		fooRepo.save(new Foo(3, "third name"));
		fooRepo.save(new Foo(4, "fourth name"));
		fooRepo.save(new Foo(5, "fifth name"));
		fooRepo.save(new Foo(6, "sixth name"));
		logger.info("=======================list all foo=======================");
		for (Foo foo : fooRepo.findAll()) {
			logger.info(foo.toString());
		}
		logger.info("=======================list all foo=======================");

	}
}
