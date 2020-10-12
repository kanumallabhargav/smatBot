package com.smatbot.qa_automation.smatBot;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pageObjects.SS2_params;

import static io.restassured.RestAssured.*;

public class SS2_apiValidation_task1 
{
	@Test
	public void SS2_task1_validation_post()
	{
		RestAssured.baseURI="http://www.smatbot.com";
		
		given().log().all()
		.queryParam("action", SS2_params.getAction())
		.queryParam("device_print", SS2_params.getDevice_print())
		.queryParam("chatbot_id", SS2_params.getChatbot_id())
		.queryParam("name", SS2_params.getName())
		.queryParam("language_code", SS2_params.language_code())
		.when().post("/kya_backend/pagehub/chatbot_utils")
		.then().log().all()
		.assertThat().statusCode(200);
	}
}
