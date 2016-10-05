package baseutils;

import java.io.IOException;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONException;

public class apifunctions {
	/*
	 * Added headers
	*/
	public void  addHeaders(HttpRequest request) throws IOException {
		request.addHeader("Authorization", "Bearer "+ Constants.authID);
		request.addHeader("Accept", "application/json");			
	    request.addHeader("Content-Type", "application/json");
	}
	/*
	 * All type of request call here
	*/	
	public HttpResponse call_Httpget(String url) throws IOException, JSONException{
		Constants.client = HttpClientBuilder.create().build();
		Constants.getRequest = new HttpGet(url);
		addHeaders(Constants.getRequest);
		return Constants.client.execute(Constants.getRequest);
		
	}	
	public HttpResponse call_Httppost(String url, String requestContent) throws IOException, JSONException{
		Constants.client = HttpClientBuilder.create().build();
		Constants.postRequest = new HttpPost(url);
		addHeaders(Constants.postRequest);
		Constants.postRequest.setEntity(new StringEntity(requestContent));
		return Constants.client.execute(Constants.postRequest);
	}
	public HttpResponse call_Httpput(String url, String requestContent) throws ClientProtocolException, IOException{
		Constants.client = HttpClientBuilder.create().build();
		Constants.putRequest = new HttpPut(url);
		addHeaders(Constants.putRequest);
		return Constants.client.execute(Constants.putRequest);
	}
}
