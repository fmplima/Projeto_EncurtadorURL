package br.com.uol.project.shorten.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.uol.project.shorten.api.resource.request.ShortenUrlRequest;
import br.com.uol.project.shorten.api.resource.response.ShortenUrlResponse;
import br.com.uol.project.shorten.api.resource.response.mapper.ShortenUrlResponseMapper;
import br.com.uol.project.shorten.api.service.ShortenUrlService;

/**
 * @author felipelima (felipe.matheuspaiva@gmail.com)
 * 
 * The Controller of API
 * 
 */

@RestController
@RequestMapping("/api")
public class ShortenServiceResource {
	
	@Autowired
	private ShortenUrlService shortenUrlService;
	
	@RequestMapping(value = "/url/shorten", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<ShortenUrlResponse> shortenUrlService(@RequestBody ShortenUrlRequest shortenRequest){
		ShortenUrlResponseMapper shortenUrlResponseMapper = new ShortenUrlResponseMapper();
		shortenUrlService.shortenUrl(shortenRequest.getUrl());
		
		return new ResponseEntity<ShortenUrlResponse>(shortenUrlResponseMapper.map(shortenUrlService.findShortenUrl()),HttpStatus.OK);
	}

}
