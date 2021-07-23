import bean.School;
import bean.SchoolAuto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
//@SpringBootApplication
//@AutoConfigurationPackage
@ComponentScan("bean")
public class DemoApplication {

    @Autowired
    private School school;

    @Autowired
    private SchoolAuto schoolAuto;


    @Bean
    public void printInfo(){
        System.out.println(" **** ---  **** "+school.toString());
    }

    @Bean
    public void printInfoAuto(){
        System.out.println(" **** ---  **** "+schoolAuto.toString());
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        System.out.println(" **** ---  **** ");




    }

}
