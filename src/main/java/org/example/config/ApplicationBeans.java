package org.example.config;

import org.example.model.Customer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConfig.class})
public class ApplicationBeans {
}
