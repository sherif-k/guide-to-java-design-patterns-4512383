package com.example;

public class TableRoom extends RoomDecorator {

  public TableRoom(Room room) {
    super(room);
  }

  public void printFurniture() {
    super.printFurniture();
    System.out.println("Table");
  }

}
