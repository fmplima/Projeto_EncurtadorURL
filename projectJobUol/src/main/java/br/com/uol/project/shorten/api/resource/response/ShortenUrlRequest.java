package br.com.uol.project.shorten.api.resource.response;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * @author felipelima (felipe.matheuspaiva@gmail.com)
 * 
 * The type request 
 * 
 */

@JsonFormat
public class ShortenUrlRequest {

	/**
	 * @param url JSON of request
	 *  
	 */
	
	private String url;


	public String getUrl() {
		return url;
	}

	public void setUrl(String param) {
		this.url = param;
	}	
	
}
