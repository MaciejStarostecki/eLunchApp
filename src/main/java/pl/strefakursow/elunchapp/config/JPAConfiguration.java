package pl.strefakursow.elunchapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("pl.strefakursow.elunchapp.repository")
public class JPAConfiguration {
}
