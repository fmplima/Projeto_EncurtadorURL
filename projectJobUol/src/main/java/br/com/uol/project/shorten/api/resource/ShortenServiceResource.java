package br.com.uol.project.shorten.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.uol.project.shorten.api.resource.response.ShortenUrlRequest;
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
	
	@RequestMapping(value = "/url/shorten", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public void shortenUrlService(@RequestBody ShortenUrlRequest shortenRequest){
		shortenUrlService.shortenUrl(shortenRequest.getUrl());
	}

}
