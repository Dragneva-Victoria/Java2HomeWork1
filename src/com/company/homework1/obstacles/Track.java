package com.company.homework1.obstacles;

import com.company.homework1.Participant;

public class Track implements Obstacle {

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean passObstacleBy(Participant participant) {
        if (participant.run() > length) {
            System.out.printf("Участник %s пробежал по дорожке длиной %d метров %n", participant, length);
            return true;
        }
        System.out.printf("Участник %s не пробежал по дорожке длиной %d м %n", participant, length);
        return false;
    }
}
