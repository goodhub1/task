package bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(School.class)
public class SchoolAuto {

    @Autowired
    School school;

    @Override
    public String toString() {
        return "SchoolAuto{" +
                "school=" + school.toString() +
                '}';
    }
}
