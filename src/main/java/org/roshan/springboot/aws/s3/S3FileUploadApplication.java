package org.roshan.springboot.aws.s3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class S3FileUploadApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(S3FileUploadApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(S3FileUploadApplication.class, args);
		LOGGER.info("S3FileUploadApplication application started successfully.");
	}
}
