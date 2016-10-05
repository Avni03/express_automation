package baseutils;

import java.io.IOException;

import org.apache.http.impl.client.BasicResponseHandler;
import org.json.JSONException;
import org.testng.annotations.Test;

public class genericfunctions extends apifunctions{
	
	
	public genericfunctions(){
		
	}

	
	public void generating_bulk_waybills() throws IOException, JSONException{

		System.out.println("in generic");
		Constants.completeURL = Constants.urlBuilder.setScheme("http")
					.setHost(Constants.baseURL)
					.setPath("api/wbn/bulk.json?mode=Express&consume=False&cl=Flipkart&count=4")
					.toString();
		System.out.println(Constants.completeURL);
		Constants.response = call_Httpget(Constants.completeURL);
		String responseString = new BasicResponseHandler().handleResponse(Constants.response);
		System.out.println(responseString);
		System.out.println("last line generic");
	}
			
	
	@Test(groups = { "ordercreation", "mps" })
	public void mps_order_creation() throws IOException, JSONException{
	
	Constants.completeURL = Constants.urlBuilder.setScheme("http")
				.setHost(Constants.baseURL)
				.setPath("/api/cmu/push/")
				.toString();
	
	String mps_order = "{"+  
			   "\"name\":\"MPS-Test-Order\","+
			   "\"order\":\"Order-001\","+
			   "\"waybill\":\"\","+
			   "\"master_id\":\"\","+
			   "\"shipment_type\":\"MPS\","+
			   "\"mps_children\":4,"+
			   "\"mps_amount\":1000,"+
			   "\"mps_weight\":45.87,"+
			   "\"mps_vweight\":987.6,"+
			   "\"client\":\"99labels\","+
			   "\"products_desc\":\"Sony PS3 Super Slim 500 GB (Black)\","+
			   "\"order_date\":\"2016-03-09T18:00:00.000000 05:30\","+
			   "\"payment_mode\":\"COD\","+
			   "\"total_amount\":1000,"+
			   "\"cod_amount\":1000,"+
			   "\"add\":\"M25, Nelson Marg, GBP City Phase, 1\","+
			   "\"city\":\"Del_Okhla_PC\","+
			   "\"state\":\"Delhi\","+
			   "\"country\":\"India\","+
			   "\"phone\":\"7768021166\","+
			   "\"pin\":\"400059\","+
			   "\"supplier\":\"Kangaroo (India) Pvt Ltd\","+
			   "\"billable_weight\":650,"+
			   "\"dimensions\":\"0.00CM x 0.00CM x 0.00CM\","+
			   "\"volumetric\":0,"+
			   "\"weight\":\"650.0 gm\","+
			   "\"pickup_start_time\":\"2015-09-09T18:00:00.000000 5:30\","+
			   "\"pickup_end_time\":\"2015-09-09T18:00:00.000000 5:30\","+
			   "\"pickup_slot_code\":\"AAAA\","+
			   "\"drop_start_time\":\"2015-09-09T18:00:00.000000 5:30\","+
			   "\"drop_end_time\":\"2015-09-09T18:00:00.000000 5:30\","+
			   "\"drop_slot_code\":\"AAAA\""+
			"}";
	
	//i = call_Httppost(Constants.completeURL , mps_order);
	//System.out.println("Mps order created with satus : "+i);
	
	}
	
	
	

	
}
