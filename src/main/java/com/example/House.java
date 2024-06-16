package com.example;

public class House {

    public static void main(String[] args) {

        var room = new BasicRoom();
        room.printFurniture();

        System.out.println();

        var couchroom = new CouchRoom(room);
        couchroom.printFurniture();

        // create a room with a carpet and a couch

        System.out.println();

        var tableroom = new TableRoom(couchroom);
        tableroom.printFurniture();

        // create a room with a carpet, a couch and a table

    }

}
