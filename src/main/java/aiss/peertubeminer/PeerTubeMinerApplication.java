package aiss.peertubeminer;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@OpenAPIDefinition(
        info = @Info(
                title = "PeerTubeMiner API",
                version = "1.0",
                description = "API REST para extraer canales, vídeos, subtítulos y comentarios de PeerTube y transformarlos al formato VideoMiner."
        )
)


@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
})
public class PeerTubeMinerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeerTubeMinerApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) { return builder.build(); }
}
