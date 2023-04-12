package com.michalski.learnspring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class ContraGame implements GamingConsole {
    public void up() {
        System.out.println("Up");
    }
    public void down() {
        System.out.println("Hide");
    }
    public void left() {
        System.out.println("Left");
    }

    public void right() {
        System.out.println("Right");
    }
}
