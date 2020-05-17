import com.nav.spring.repository.HibernateSpeakerRepositoryImpl;
import com.nav.spring.repository.SpeakerRepository;
import com.nav.spring.service.SpeakerService;
import com.nav.spring.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


//  Example of setter injection
//    @Bean(name="speakerService")
//    public SpeakerService getSpeakerService() {
//        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
//        speakerService.setSpeakerRepository(getSpeakerRepository());
//        return speakerService;
//    }

    // Constructor injection
    @Bean(name="speakerService")
    public SpeakerService getSpeakerService() {
        return new SpeakerServiceImpl(getSpeakerRepository());
    }

    @Bean(name="speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}
