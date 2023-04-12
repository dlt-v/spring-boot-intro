package com.michalski.learnspring;

import com.michalski.learnspring.game.GameRunner;
import com.michalski.learnspring.game.GamingConsole;
import com.michalski.learnspring.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

}
