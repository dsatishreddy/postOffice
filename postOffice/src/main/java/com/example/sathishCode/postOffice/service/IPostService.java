package com.example.sathishCode.postOffice.service;

import com.example.sathishCode.postOffice.output.PostOfficeResponseBean;

public interface IPostService {
	
	public PostOfficeResponseBean fetchPostOfficeDetailsByCity(String city);

}
