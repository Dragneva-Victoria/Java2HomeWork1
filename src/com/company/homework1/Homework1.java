package com.company.homework1;

import com.company.homework1.obstacles.Obstacle;
import com.company.homework1.obstacles.Track;
import com.company.homework1.obstacles.Wall;
import com.company.homework1.participant.Cat;
import com.company.homework1.participant.Human;
import com.company.homework1.participant.Robot;

public class Homework1 {

    public static void main(String[] args) {
        Human human = new Human("Олег");
        Cat cat = new Cat("Кузя");
        Robot robot = new Robot("Max453");

        Track track = new Track(120);
        Wall wall = new Wall(12);


        Participant[] participants = {human, cat, robot};
        Obstacle[] obstacles = {track, wall};

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.passObstacleBy(participant)) {
                    System.out.printf("Участник %s проиграл %n", participant);
                    break;
                }
            }
        }

    }
}