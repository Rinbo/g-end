package nu.borjessons.app.ws.security;

public class SecurityConstants {
	public static final long EXPIRATION_TIME = 864000000;
	public static final String TOKEN_PREFIX = "Bearer";
	public static final String HEADER_STRING = "Authorization";
	public static final String SIGN_UP_URL = "/users";
	public static final String TOKEN_SECRET = "kdlfojadf84hjjf3ddffe34v";
	public static final String VERIFICATION_EMAIL_URL = "/users/email-verification";

}
