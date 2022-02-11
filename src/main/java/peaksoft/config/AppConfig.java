package peaksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.model.*;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {



    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }


    @Bean
    public static Needle7 needle7(){
        return new Needle7();
    }

    @Bean
    public static Egg6 egg6(){
        return new Egg6(needle7());
    }


}