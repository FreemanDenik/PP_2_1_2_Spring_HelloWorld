import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat1 = (Cat)applicationContext.getBean("cat");
        Cat cat2 = (Cat)applicationContext.getBean("cat");

        boolean resultSingleton = bean1 == bean2;
        boolean resultPrototype = cat1 == cat2;

        System.out.println("Helloworld (singleton): " + resultSingleton);
        System.out.println("Cat (prototype): " + resultPrototype);

    }
}