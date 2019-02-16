package br.com.uol.project.shorten.api.service;

import br.com.uol.project.shorten.api.resource.response.ShortenUrlResponse;

/**
 * @author felipelima (felipe.matheuspaiva@gmail.com)
 * 
 * The interface for implementation service
 */

public interface ShortenUrlService {
	
	/**
	 * @return 
	 * @throws Exception 
	 * @method for implementation shorten service
	 * 
	 */
	
	public void shortenUrl(final String url);
	
	public String findShortenUrl();
}
