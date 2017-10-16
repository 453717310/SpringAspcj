import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import user.UserService;

/**
 * Created by dll on 2017/10/15.
 */
public class UserTest {
    //针对于xml方法
    @Test
    public  void  testXml(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        UserService service= (UserService) context.getBean("userService");
        service.eat();
        service.sleep();
    }
}
