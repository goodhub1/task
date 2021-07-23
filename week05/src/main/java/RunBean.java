import bean.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunBean {





    public static void main(String[] args) {


//        BeanFactory BeanFactory= new BeanFactory();
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(Student.class);


//        applicationContext.refresh();

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");



        String[] aa = applicationContext.getBeanDefinitionNames();

        System.out.println(" **** ---- ****");

    }
}
