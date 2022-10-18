package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        //1) Cat деген POJO класс тузунуз
        //2) AppConfig класстын ичинде cat деген класска бин тузунуз
        //3) Ал бинди ар бир чакырганда жаны объект тузуло тургандай кылып настройка кылыныз
        //4) App классында HelloWorldду дагы бир жолу жана Catти эки жолу чакырыныз.
        // Аларды ссылкасы менен салыштырып коруп жообун консольго чыгарыныз.
        //5) Тестти комментарийден чыгарып иштетип корунуз
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Hello World: " + (bean == bean2));
        System.out.println(bean.getMessage());

        Cat cat = applicationContext.getBean("cat",Cat.class);
        Cat cat2 = applicationContext.getBean("cat",Cat.class);
        System.out.println("Cat = Cat2 ? " + (cat == cat2));
        System.out.println(cat);

    }
}
