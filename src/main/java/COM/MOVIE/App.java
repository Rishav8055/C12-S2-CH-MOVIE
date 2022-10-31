package COM.MOVIE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(movieConfig.class);
        movies movies1= context.getBean("movie1",movies.class);
        System.out.println(movies1);

        movies movies2=context.getBean("movie2",movies.class);
        System.out.println(movies2);

        movies movies3=context.getBean("movie3",movies.class);
        System.out.println(movies3);
    }
}
