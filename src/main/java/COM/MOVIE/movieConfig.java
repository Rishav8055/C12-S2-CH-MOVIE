package COM.MOVIE;

import org.springframework.context.annotation.Bean;

public class movieConfig {
    @Bean("movie1")
    public movies getMovieDetail(){
        return new movies(1,"Avenger","23-6-2022","Tony-Stark","papper");
    }
    @Bean("movie2")
    public movies getMovieDetail1(){
        return new movies(2,"Avenger1","4-2-2019","Tony-Stark","Papper");
    }
    @Bean("movie3")
    public movies getMovieDetail2(){
        return new movies(3,"Avenger2","4-2-2019","Tony-Stark","Papper");
    }
}
