package com.sct.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CreditRatingServiceEndpoint {
	private final CreditRatingService service;
	public CreditRatingServiceEndpoint(CreditRatingService service) {
		this.service =service;
	}
	@WebMethod
	public Score getCreditScore(Customer customer) {
		return service.getCreditScore(customer);
	}
}
