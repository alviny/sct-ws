package com.sct.ws;

import java.util.concurrent.Future;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

public interface CreditRatingService {
       // Synchronous operation.
       Score getCreditScore(Customer     customer);
       // Asynchronous operation with polling.
       Response<Score> getCreditScoreAsync(Customer customer);
       // Asynchronous operation with callback.
       Future<?> getQuoteAsync(Customer customer,  AsyncHandler<Score> handler);
}