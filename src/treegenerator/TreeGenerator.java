/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treegenerator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davidkhanks
 */
public class TreeGenerator {

    List<Person> personList = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeGenerator treeGen = new TreeGenerator();
           
           treeGen.run();
    }
    
    public void run() {
          PersonCreator pc = new PersonCreator();
          pc.createPerson("Anastasia", "Aleksandrova", "Female", "This is a message");


          Gson gson = new GsonBuilder().setPrettyPrinting().create();
          
          
          String json = gson.toJson(pc);
          
          try {
              FileWriter writer = new FileWriter("/Users/davidkhanks/Desktop/Person.json");
              writer.write(json);
              writer.close();
              
            
          } catch (IOException e) {
              e.printStackTrace();
          }
//        
          
          
//        System.out.println(thisGuy.getFirstName());
//        System.out.println("The dad: " + thisGuy.getFather().getFirstName());
//        try {
//            System.out.println("The dad's dad: " + thisGuy.getFather().getFather().getFirstName());
//        } catch(NullPointerException e) {
//            System.out.println("The dad's dad is currently unkown");
//        }
//        System.out.println("The dad's children: ");
//        for(Person child : thisGuysDad.getChildren()) {
//            System.out.println(child.getFirstName());
//        }
//        
        
//        Conclusion conc = new Conclusion();
//        
//        conc.setConfidenceLevel(ConfidenceLevel.LOW);
//        
//        String conf = conc.getConfidenceLevel().getConfidenceLevel();
//        
//        System.out.println(conf);
        
//        generatePeople(0);
//        
//        for (Person person : personList) {
//            System.out.println(person);
//        }
        
    }
//    
//    
//    public void generatePeople(int count) {
//        if (count > 6) {
//            return;
//        }
//        Person person = new Person("first" + count, "last" + count);
//        personList.add(person);
////        System.out.println(person.getFirstName());
//            
//        generatePeople(count + 1);
//    }
    
}
