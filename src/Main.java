import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void  main(String args[]) throws PerformanceException {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("main.xml");
        Performer performer=(Performer)ctx.getBean("duke");
        performer.perform();

        System.out.println("hello" +
                "");
    }
}
