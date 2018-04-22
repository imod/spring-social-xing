package org.springframework.social.xing.security;

import org.springframework.social.security.provider.OAuth2AuthenticationService;
import org.springframework.social.xing.api.Xing;
import org.springframework.social.xing.connect.XingConnectionFactory;

public class XingAuthenticationService extends OAuth2AuthenticationService<Xing> {

	public XingAuthenticationService(String apiKey, String appSecret) {
		super(new XingConnectionFactory(apiKey, appSecret));
	}

}
