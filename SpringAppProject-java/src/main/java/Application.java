import com.deepak.service.SpeakerService;
import com.deepak.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {

    public static  void main(String args[]) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //SpeakerService service =  new SpeakerServiceImpl();

        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service.findALL().get(0).getFirstName());
        System.out.println(service.findALL().get(0).getLastName());
    }
}


