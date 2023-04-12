package com.michalski.learnspring;

import com.michalski.learnspring.game.GameRunner;
import com.michalski.learnspring.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.michalski.learnspring.game")
public class GamingAppLauncher {

//    @Bean
//    public GamingConsole game() {
//        var game = new PacmanGame();
//        return game;
//    }

//    @Bean
//    public GameRunner gameRunner(GamingConsole game) {
//        return new GameRunner(game);
//    }

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncher.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}
