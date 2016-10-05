package express.mps;

import java.io.IOException;

import org.json.JSONException;

import baseutils.genericfunctions;

public class Mps_TestCases {

	//Random rand = new Random(); 
	//int x = rand.nextInt(10);

	public void main() throws IOException, JSONException{
		genericfunctions gf=new genericfunctions();
		System.out.println("Object created");
		gf.generating_bulk_waybills();
		System.out.println("Executed");
	}
	
}