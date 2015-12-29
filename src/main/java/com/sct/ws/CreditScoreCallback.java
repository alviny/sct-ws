package com.sct.ws;

import java.util.concurrent.ExecutionException;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

public class CreditScoreCallback implements AsyncHandler<Score>{
	private Score score;
	public void handleResponse(Response<Score> resp) {
		try {
			score = resp.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
	public Score getResponse(){
		return this.score;
	}
}
