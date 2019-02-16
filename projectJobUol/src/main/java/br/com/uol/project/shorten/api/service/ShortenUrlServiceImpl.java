package br.com.uol.project.shorten.api.service;

import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;


@Service
public class ShortenUrlServiceImpl implements ShortenUrlService{

	private static final String SHORTEN_URL_INVALID = "Error validate URL. Invalid URL";
	private static String REGEX_VALIDATE_URL = "(.*((https|http)).*)?(.*[!@#$*&()].*)";
	private static String URL = "https://shortenUOL/";
	
	private String urlShorten;
	
	@Override
	public void shortenUrl(final String url){
		
		validateUrl(url);
		String urlShorten = encryptUrl(url);
		this.urlShorten = urlShorten;
		
	}
	
	private boolean validateUrl(final String url){
		
		boolean validateUrl = false;
		boolean urlRegexMatch= urlRegexMatch(REGEX_VALIDATE_URL, url);
		
		if(urlRegexMatch) {
			throw new IllegalArgumentException(SHORTEN_URL_INVALID);
		}
		
		return validateUrl = true;
	}
	
	private boolean urlRegexMatch(final String regex, final String url) {
	
		boolean matchRegex = false;
		Pattern pattern = Pattern.compile(REGEX_VALIDATE_URL);
		Matcher matcherUrl = pattern.matcher(url);
		
		return matchRegex = matcherUrl.matches();
	}
	
	private String encryptUrl(final String url) {
		
		String urlEncrypt = (Base64.getEncoder().encodeToString(url.getBytes())).substring(0,9);
		return urlEncrypt;
		
	}

	@Override
	public String findShortenUrl() {
		return URL + this.urlShorten;
	}

	
}


