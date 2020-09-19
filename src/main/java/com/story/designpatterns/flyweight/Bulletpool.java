package com.story.designpatterns.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Bulletpool {
    List<Bullet> bullets = new ArrayList<>();
    {
        for (int i = 0; i < 5; i++) {
            bullets.add(new Bullet());
        }
    }

    public Bullet getBullet(){
        for (int i = 0;i<bullets.size();i++){
            Bullet bullet = bullets.get(i);
            if (bullet.living){
                System.out.println("take bullet from pool " + i);
                bullet.living = false;
                return bullet;
            }
        }
        return new Bullet();
    }

    public static void main(String[] args) {
        Bulletpool bulletpool = new Bulletpool();

        for (int i = 0; i < 10; i++) {
            Bullet bullet = bulletpool.getBullet();
            System.out.println(bullet);
        }
    }
}

class Bullet{
    public UUID id = UUID.randomUUID();
    boolean living = true;

    @Override
    public String toString() {
        return "Bullet{" +
                "id=" + id +
                '}';
    }
}
