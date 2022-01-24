package com.example.SpringBootCommunityWeb.oauth;

import org.springframework.boot.context.properties.NestedConfigurationProperty;

public class ClientResources {

    @NestedConfigurationProperty
    private AuthorizationProperty client = new AuthorizationCodeResourceDetails();

    @NestedConfigurationProperty
    private ResourceServerProperties resource = new ResourceServerProperties();

    public AuthorizationProperty getClient() {
        return client;
    }

    public ResourceServerProperties getResource() {
        return resource;
    }
}
