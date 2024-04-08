package com.example.sathishCode.postOffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sathishCode.postOffice.output.PostOfficeResponseBean;
import com.example.sathishCode.postOffice.service.IPostService;

@RestController
@RequestMapping("/postal")
public class PostDetailsController {
	
	@Autowired
	IPostService postServiceImpl;
	
	@RequestMapping(value="/byCity", method = RequestMethod.GET, consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public PostOfficeResponseBean getPostByCity(@RequestParam String city)
	{
		PostOfficeResponseBean postResponse;
		
		postResponse = postServiceImpl.fetchPostOfficeDetailsByCity(city);
		
		return postResponse;
	}

}
