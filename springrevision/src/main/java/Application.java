import com.nav.spring.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService speakerService = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(speakerService.findAll().get(0).getFirstName());
        System.out.println(speakerService.findAll().get(0).getSeedNum());

        SpeakerService speakerService2 = appContext.getBean("speakerService", SpeakerService.class);
        if (speakerService == speakerService2){
            System.out.println("both instances are same. It oughta be Singleton");
        } else{
            System.out.println("both instances are NOT same. It isn't Singleton. Prototype likely!");
        }

//        Integer x = 0;
//        Number y = 10.0;
//        System.out.println(x.getClass()); // Integer
//        System.out.println(y.getClass()); // Double
//        if (x instanceof Number) {
//            System.out.println("Integer is an instance of Number"); // Yes
//        }


    }
}
