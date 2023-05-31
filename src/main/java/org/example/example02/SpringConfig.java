package org.example.example02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("org.example.example02")
@PropertySource("musicPlayer.properties")
public class SpringConfig {
}
