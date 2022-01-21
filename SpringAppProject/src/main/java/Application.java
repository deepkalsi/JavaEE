import com.deepak.service.SpeakerService;
import com.deepak.service.SpeakerServiceImpl;

import java.util.List;

public class Application {

    public static  void main(String args[]) {
        SpeakerService service =  new SpeakerServiceImpl();

        System.out.println(service.findALL().get(0).getFirstName());
        System.out.println(service.findALL().get(0).getLastName());
    }
}


