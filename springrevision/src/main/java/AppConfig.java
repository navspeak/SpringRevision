import com.nav.spring.repository.HibernateSpeakerRepositoryImpl;
import com.nav.spring.repository.SpeakerRepository;
import com.nav.spring.service.SpeakerService;
import com.nav.spring.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.nav.spring"})
public class AppConfig {


//  Example of setter injection
//    @Bean(name="speakerService")
//    public SpeakerService getSpeakerService() {
//        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
//        speakerService.setSpeakerRepository(getSpeakerRepository());
//        return speakerService;
//    }
/* NOT NEEDED NOW AS WE HAVE STEREOTYPE ANNOTATIONS IN PLACE
    // Constructor injection
    @Bean(name="speakerService")
    //@Scope(value= BeanDefinition.SCOPE_SINGLETON)
    //@Scope(value= BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerService() {
        //return new SpeakerServiceImpl(getSpeakerRepository());
        return new SpeakerServiceImpl(); // use autowire inside
    }

    @Bean(name="speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

 */
}
