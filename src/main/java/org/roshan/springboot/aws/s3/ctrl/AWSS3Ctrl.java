package org.roshan.springboot.aws.s3.ctrl;

import org.roshan.springboot.aws.s3.serv.AWSS3Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value= "/s3")
public class AWSS3Ctrl {
	private static final Logger LOGGER = LoggerFactory.getLogger(AWSS3Ctrl.class);
	@Autowired
	private AWSS3Service service;

	@PostMapping(value= "/upload")
	public ResponseEntity<String> uploadFile(@RequestPart(value= "file") final MultipartFile multipartFile) {
		String signedURL=service.uploadFile(multipartFile);
		LOGGER.info(multipartFile.getOriginalFilename() + " uploaded successfully..");		
		return new ResponseEntity<>(signedURL, HttpStatus.OK);
	}
}
