package com.blind.api.domain.security.oauth.v2.info.impl;

import com.blind.api.domain.security.oauth.v2.info.OAuthUserInfo;
import com.google.common.hash.Hashing;


import java.nio.charset.StandardCharsets;
import java.util.Map;

public class FortyTwoOAuthUserInfo extends OAuthUserInfo {
    public FortyTwoOAuthUserInfo(Map<String, Object> attributes) {
        super(attributes);
    }
    @Override
    public String getHashId() {
        return Hashing.sha256()
                .hashString(attributes.get("id").toString(), StandardCharsets.UTF_8)
                .toString();
    }
}
