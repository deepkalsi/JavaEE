import com.deepak.repository.HibernateSpeakerRepositoryImpl;
import com.deepak.repository.SpeakerRepository;
import com.deepak.service.SpeakerService;
import com.deepak.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean( name= "speakerService")
    public SpeakerService getSpeakerService(){
         SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
         //service.setRepository(getSpeakerRepository());

         return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

}
