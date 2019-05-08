package com.example.jersey;

import com.example.jersey.controller.LibraryController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig()
    {
        register(LibraryController.class);
    }
}
