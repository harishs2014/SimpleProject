package Stepdefinition;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

import APITest.RequestBody;
import APITest.RestRequestRunner;
import APITest.ServiceResponse;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;

public class SampleAPITest {
	Response response = null;

	@Given("^Run the RestFul service by providing valid Endpoint$")
	public void run_the_RestFul_service_by_providing_valid_Endpoint() throws Throwable {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("Configuration.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		String baseURI = props.get("baseURI").toString();
		System.out.println("API End point is " + baseURI);
		Map<String, String> request = RequestBody.addRequestParams(new String[] { "name" }, new String[] { "India" });
		response = RestRequestRunner.runRequestWithGivenParams("", "", null, baseURI, request);
		System.out.println("Service Run response is " + response.asString());
	}

	@Then("^Validate the service ran successfully and status code is accepted$")
	public void validate_the_service_ran_successfully_and_status_code_is_accepted() throws Throwable {
		Assert.assertTrue(ServiceResponse.getServiceResponseStatCode(response) == 200);

	}

	@Then("^Validate the service returned required details for given parameter$")
	public void validate_the_service_returned_required_details_for_given_parameter() throws Throwable {
		JSONObject JSONResponseBody = ServiceResponse.getServiceResponseInJsonObjectFormat(response);
		Assert.assertTrue(JSONResponseBody.getJSONArray("borders").get(0).toString().equalsIgnoreCase("IRN"));
		// List<list> data = table.raw();
	}

	@Given("^I open Facebook URL and create new accounts with below data$")
	public void i_open_Facebook_URL_and_create_new_accounts_with_below_data(DataTable data) throws Throwable {
		List<Map<String, String>> list = data.asMaps(String.class, String.class);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).get("First Name"));
			System.out.println(list.get(i).get("Last Name"));
		}
	}

	@Given("^I open Facebook URL and create new accounts with below datas$")
	public void i_open_Facebook_URL_and_create_new_accounts_with_below_datas(DataTable data) throws Throwable {
		List<List<String>> list = data.asLists(String.class);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).get(0));
			System.out.println(list.get(i).get(1));

		}
	}

	@Given("^This is background code$")
	public void this_is_background_code() throws Throwable {
		System.out.println("Background is running");
		JSONObject json=new JSONObject();
		json.put("Country", "India");
		json.put("Currency", "60");
		json.put("Lan", "English");
		json.put("Animal", "Tiger");
		json.put("Developed", true);
		JSONArray jsonArray=new JSONArray();
		HashMap<String, String> arrayObjcts=new HashMap<String, String>();
		arrayObjcts.put("State", "Karnataka");
		arrayObjcts.put("Language", "Kannada");
		HashMap<String, String> arrayObjcts2=new HashMap<String, String>();
		arrayObjcts2.put("State", "TN");
		arrayObjcts2.put("Language", "Tamilnadu");
		jsonArray.put(arrayObjcts);
		jsonArray.put(arrayObjcts2);
		json.put("States", jsonArray);
		System.out.println(json.toString());
		
	}

}
