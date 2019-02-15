package br.com.uol.project.shorten.api.ExceptionEnum;

public enum ShortenExceptionKeyEnum {
	
	SHORTEN_URL_INVALID("shorten.url.invalid");
	
	private String keyEnum;
	
	private ShortenExceptionKeyEnum(String key) {
		keyEnum = key;
		
	}
		
	public String getKey() {
		return keyEnum;
	}
}
