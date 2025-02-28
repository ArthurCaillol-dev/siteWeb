package ad.example.webSite;

import ad.example.webSite.users.UserController;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.event.EventListener;


@SpringBootApplication
// Active la lecture du fichier properties pour la création d'objet basés sur ce dernier
@ConfigurationPropertiesScan("ad.example.webSite.conf")
//@Profile("dev") : Utilisable mais pau maintenable
@RequiredArgsConstructor
public class webSiteApplication {

    private final UserController controller;

    public static void main(String[] args) {
        SpringApplication.run(webSiteApplication.class, args);
    }

    @EventListener
    public void postStart(ApplicationStartedEvent event) {
        System.out.println("User controller :");
        System.out.println("controller = \u001B[31m" + controller + "\u001B[0m");
    }
}
