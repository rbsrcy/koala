package org.openkoala.koala.auth.ss3adapter;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

public final class SecurityMD5 {

	private static Md5PasswordEncoder fs = new Md5PasswordEncoder();
	
	private SecurityMD5() {
		
	}

	public static String encode(String password, String salt) {
		return fs.encodePassword(password, salt);
	}

	public static boolean isPasswordValid(String encPass, String rawPass, String salt) {
		return fs.isPasswordValid(encPass, rawPass, salt);
	}
	
}