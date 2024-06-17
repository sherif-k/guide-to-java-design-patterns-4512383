package com.example;

public class CouchRoom extends RoomDecorator {

  public CouchRoom(Room room) {
    super(room);

  }

  public void printFurniture() {
    super.printFurniture();
    System.out.println("Couch");
  }

}
