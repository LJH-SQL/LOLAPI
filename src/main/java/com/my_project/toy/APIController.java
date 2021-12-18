package com.my_project.toy;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.my_project.model.APIDTO;

@Controller
public class APIController {
	@RequestMapping(value = "LOLAPI.search" )
	public ModelAndView LOLAPI(String name, HttpServletRequest req) {	//객체 가져오기
		ModelAndView mav = new ModelAndView("info");
		APIDTO dto = new APIDTO();
		RestTemplate rt = new RestTemplate(); 
		String summonerName = name.replace(" ","%20"); // 공백처리 (lolAPI에선 공백을 %20으로 변환)
		String APIKey = "RGAPI-f370b62c-c595-4540-adde-b230cb6a4b1f";
		String requestURL = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/"+summonerName+"?api_key="+APIKey;
		HttpHeaders header = new HttpHeaders();
		header.add("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36");
		header.add("Accept-Language", "ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7");
		header.add("Accept-Charset","application/x-www-form-urlencoded; charset=UTF-8");
		header.add("Origin","https://developer.riotgames.com");
		HttpEntity<MultiValueMap<String,String>> he = new HttpEntity(header);
		ResponseEntity<String> response = rt.exchange(
				requestURL,
				HttpMethod.GET,
				he,
				String.class
		);
		
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			dto = objectMapper.readValue(response.getBody(), APIDTO.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		mav.addObject("response",response);
		return mav;
	}
}
