package com.smatbot.qa_automation.smatBot;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pageObjects.SS3_params;

public class SS3_apiValidation_task2 
{
	@Test
	public void SS3_task2_validation_post()
	{
		RestAssured.baseURI="http://www.smatbot.com";
		
		given().log().all()
		.queryParam("action", SS3_params.getAction())
		.queryParam("answer_text", SS3_params.getAnswer_text())
		.queryParam("cb_session", SS3_params.getCb_session())
		.queryParam("question_id", SS3_params.getQuestion_id())
		.queryParam("is_logical", SS3_params.getIs_logical())
		.queryParam("sequence", SS3_params.getSequence())
		.queryParam("chatbot_id", SS3_params.getChatbot_id())
		.queryParam("option", SS3_params.getOption())
		.queryParam("visitor_link_traversal", SS3_params.getVisitor_link_traversal())
		.queryParam("language_code", SS3_params.getLanguage_code())
		.when().post("/kya_backend/pagehub/chatbot_utils")
		.then().log().all()
		.assertThat().statusCode(200);
	}
}
