package com.epicode.spring_w1_d2.runner;

import com.epicode.spring_w1_d2.entity.Menu;
import com.epicode.spring_w1_d2.repository.MenuRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Component
@RequiredArgsConstructor
@Order(4)
public class MenuRunner implements ApplicationRunner {

    private final MenuRepo menuRepo;
    private final Logger logger;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        List<Menu> listaMenu = menuRepo.findAll();

        listaMenu.forEach(menu -> logger.info(menu.stampa()));

    }
}
