package com.example.sathishCode.postOffice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.sathishCode.postOffice.outut.PostOfficeDetailsBean;
import com.example.sathishCode.postOffice.outut.PostOfficeResponseBean;
import com.example.sathishCode.postOffice.service.IPostService;

@Service("postalServiceImpl")
public class PostalServiceImpl implements IPostService{

	@Autowired()
	RestTemplate restTemplate;
	
	@Override
	public PostOfficeResponseBean fetchPostOfficeDetailsByCity(String cityValue) {
		
		String url = "https://api.postalpincode.in/postoffice/{city}";
		
		url = url.replace("{city}", cityValue);
		
		System.out.println("Url is: "+url);
		
		ResponseEntity<PostOfficeResponseBean[]> postalResponseEntity = 
		
		restTemplate.getForEntity(url, PostOfficeResponseBean[].class);
		
		System.out.println("Response Status code is "+postalResponseEntity.getStatusCodeValue());
		
	   PostOfficeResponseBean[] responseBeanArray =	postalResponseEntity.getBody();
		
	   for(PostOfficeResponseBean responseBean : responseBeanArray)
	   {
		   List<PostOfficeDetailsBean> postOfficeListBean = responseBean.getPostOffice();
	       for(PostOfficeDetailsBean pob: postOfficeListBean)
	       {
	    	  System.out.println(pob.getName()+"***"+pob.getPincode()); 
	       }
	   }
		return responseBeanArray[0];
	}

}
