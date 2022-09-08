import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class exercise {
    @Bean(initMethod = "init" ,destroyMethod = "destroy")
    public Demo demo()
    {
        return new Demo();
    }
    @Bean @Scope("singleton")
    public  Demo2 demo2()
    {
        return new Demo2(demo());
    }
}
