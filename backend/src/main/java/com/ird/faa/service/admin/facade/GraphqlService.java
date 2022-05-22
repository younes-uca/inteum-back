package com.ird.faa.service.admin.facade;

import org.springframework.http.ResponseEntity;

import com.ird.faa.ws.rest.provided.dto.TokenDto;

public interface GraphqlService {
	public ResponseEntity<String> executeQuery(String url,String query); 
	public TokenDto getToken();
}
