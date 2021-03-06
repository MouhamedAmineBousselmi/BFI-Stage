package com.BanqueSIClient.BanqueSIClient.config;

/**
 * Created by amino 2017-07-07.
 */

import com.BanqueSIClient.BanqueSIClient.DTO.ClientDTO;
import com.BanqueSIClient.BanqueSIClient.DTO.UserTokenState;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

	@Value("${jwt.expires_in}")
    private int EXPIRES_IN;

	@Autowired
	TokenHelper tokenHelper;

	@Autowired
    ObjectMapper objectMapper;

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication ) throws IOException, ServletException {
		clearAuthenticationAttributes(request);
		ClientDTO client = (ClientDTO) authentication.getPrincipal();
		String jws = tokenHelper.generateToken( client.getUsername() );

		// JWT is also in the response
		UserTokenState userTokenState = new UserTokenState(jws, EXPIRES_IN);
		String jwtResponse = objectMapper.writeValueAsString( userTokenState );
		response.setContentType("application/json");
		response.getWriter().write( jwtResponse );
	}
}
