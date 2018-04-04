package com.epam.rd.security.auth.jwt.verifier;


public interface TokenVerifier {
    public boolean verify(String jti);
}
