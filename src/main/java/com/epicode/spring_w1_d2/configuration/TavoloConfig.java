package com.epicode.spring_w1_d2.configuration;

import com.epicode.spring_w1_d2.entity.Tavolo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class TavoloConfig {
    @Bean
    public Tavolo tavolo1(){
        Tavolo tavolo = new Tavolo();
        tavolo.setNumeroTavolo(1);
        return tavolo;
    }
    @Bean
    public Tavolo tavolo2(){
        Tavolo tavolo = new Tavolo();
        tavolo.setNumeroTavolo(1);
        return tavolo;
    }
    @Bean
    public Tavolo tavolo3(){
        Tavolo tavolo = new Tavolo();
        tavolo.setNumeroTavolo(1);
        return tavolo;
    }
    @Bean
    public Tavolo tavolo4(){
        Tavolo tavolo = new Tavolo();
        tavolo.setNumeroTavolo(1);
        return tavolo;
    }


}
