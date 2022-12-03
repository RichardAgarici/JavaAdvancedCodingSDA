package com.sda.richardagarici.advanced.coding.collections.ex9;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Zoo {
   private final Map<String, Integer> animals =new HashMap<>();

   public int getNumberOfAllAnimals (){
       return animals.values().stream()
               .collect(Collectors
                       .summingInt(numberOfAnimals -> numberOfAnimals));
   }
   public int getAnimals
}
