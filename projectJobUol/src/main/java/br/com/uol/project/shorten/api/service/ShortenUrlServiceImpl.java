package br.com.uol.project.shorten.api.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import br.com.uol.project.shorten.api.ExceptionEnum.ShortenExceptionKeyEnum;

@Service
public class ShortenUrlServiceImpl implements ShortenUrlService{

	private static String REGEX_VALIDATE_URL = "^(?:http(s)?:\\/\\/)?[\\w.-]+(?:\\.[\\w\\.-]+)";
	
	@Override
	public void shortenUrl(final String url){
		validateUrl(url);
	}
	
	private boolean validateUrl(final String url){
		
		boolean validateUrl = false;
		
		Pattern pattern = Pattern.compile(REGEX_VALIDATE_URL);
		Matcher matcherUrl = pattern.matcher(url);
		
		if(!matcherUrl.matches()) {
			//throw new IllegalArgumentException(ShortenExceptionKeyEnum.SHORTEN_URL_INVALID);
		}
		
		return validateUrl = true;
	}

}
