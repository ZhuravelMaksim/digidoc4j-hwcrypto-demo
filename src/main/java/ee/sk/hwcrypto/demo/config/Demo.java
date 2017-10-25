package ee.sk.hwcrypto.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created by Janar Rahumeel (CGI Estonia)
 */

@Configuration
public class Demo {

    @Autowired
    private Environment environment;

    @Bean
    public org.digidoc4j.Configuration configuration() {
        return new org.digidoc4j.Configuration();
    }

}
