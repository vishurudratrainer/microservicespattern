package com.example.springgraphqldemo;

import com.example.springgraphqldemo.actor.Actor;
import com.example.springgraphqldemo.actor.ActorController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringGraphqlDemoApplicationTests {

    @Autowired
    private ActorController actorController;

    @Test
    void queryActorById() {
        Actor actor = actorController.actorById(1L);
        assert actor.name().equals("Keanu Reeves");
    }
}
