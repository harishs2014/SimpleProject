package APITest;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class ServiceResponse {
	
	  public static int getServiceResponseStatCode(Response response) {
		return response.getStatusCode();
	  }
	
	public static JSONObject getServiceResponseInJsonObjectFormat(Response response) throws JSONException {
		JSONObject JSONResponseBody = new JSONObject(response.body().asString().replace("[{", "{").replace("}]", "}"));
	    return JSONResponseBody;
	}
	
	public static JSONArray getRespJSONArrayForReqArray(Response response,String reqArray) throws JSONException {		
	    return getServiceResponseInJsonObjectFormat(response).getJSONArray(reqArray);
	}
	
	public static Headers getRespHeaders(Response response) {
		return response.getHeaders();
	}



}
