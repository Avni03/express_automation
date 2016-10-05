package baseutils;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URIBuilder;

public class Constants {

	public static String baseURL="staging-express.delhivery.com";
	public static URIBuilder urlBuilder = new URIBuilder();
	public static String completeURL=null;
	public static final String authID="968890ec482febcda9de7ea1e1955fcba765dbba";
	

	public static HttpClient client;
	public static HttpGet getRequest;
	public static HttpPost postRequest;
	public static HttpPut putRequest;
	public static HttpResponse response;
	public static String requestContent;
	public static int status;
	
}
