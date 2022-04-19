package com.company.homework1.obstacles;

import com.company.homework1.Participant;

public class Wall implements Obstacle {

    private final int height;

    public Wall(int length) {
        this.height = length;
    }

    @Override
    public boolean passObstacleBy(Participant participant) {
        if (participant.jump() > height) {
            System.out.printf("Участник %s перебрыгнул через стену высотой %d м %n", participant, height);
            return true;
        }
        System.out.printf("Участник %s не перепрыгнул через стену высотой %d м %n", participant, height);
        return false;
    }
}
