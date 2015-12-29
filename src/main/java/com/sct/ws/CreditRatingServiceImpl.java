package com.sct.ws;

import java.util.concurrent.Future;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CreditRatingServiceImpl implements CreditRatingService{
	private static final Logger logger = LogManager.getLogger(CreditRatingServiceImpl.class);
	public Score getCreditScore(Customer customer) {
		logger.info("Customer " + customer.getName());
		return new Score(5);
	}
	public Response<Score> getCreditScoreAsync(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}
	public Future<?> getQuoteAsync(Customer customer, AsyncHandler<Score> handler) {
		// TODO Auto-generated method stub
		return null;
	}

}
