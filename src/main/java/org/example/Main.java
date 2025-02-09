package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(LampType.NEON,true,100);
        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        Bed bed = new Bed("double",2,2,2,2);
        Wall eastWall = new Wall("East");
        Wall westWall = new Wall("West");
        Wall northWall = new Wall("North");
        Wall southWall = new Wall("South");
        Wall[] walls = new Wall[]{eastWall, westWall, northWall, southWall};

        Bedroom bedroom = new Bedroom(eastWall,westWall,northWall,southWall,ceiling,lamp,
                new Carpet(2,3,PaintColor.WHITE),
                "bedroom1", bed, new Wardrobe(1,2,100));
        bedroom.createBedroom();
    }
}