package org.example.designPatterns.builder;

public class Bottle implements Packing {
 
   @Override
   public String pack() {
      return "Bottle";
   }
}