package com.example.sathishCode.postOffice.service;

import com.example.sathishCode.postOffice.outut.PostOfficeResponseBean;

public interface IPostService {
	
	public PostOfficeResponseBean fetchPostOfficeDetailsByCity(String city);

}
