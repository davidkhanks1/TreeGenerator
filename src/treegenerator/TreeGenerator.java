/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treegenerator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Generates the JSON needed to make a request to create persons
 * @author davidkhanks
 */
public class TreeGenerator {

    List<Person> personList = new ArrayList();
    List<String> surnames = new ArrayList();
    List<String> boysNames = new ArrayList();
    List<String> girlsNames = new ArrayList();
    String[] months = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
    int[] dates = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
    
    PersonData[] firstGen = new PersonData[1];
    PersonData[] secondGen = new PersonData[2];
    PersonData[] thirdGen = new PersonData[3];
    PersonData[] fourthGen = new PersonData[4];
    PersonData[] fifthGen = new PersonData[5];
    PersonData[] sixthGen = new PersonData[6];
    PersonData[] seventhGen = new PersonData[7];
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeGenerator treeGen = new TreeGenerator();
           
           treeGen.run();
    }
    
    public void run() {
        String user = System.getProperty("user.name");
        String surnamesFile = "/Users/" + user + "/Desktop/surnames.csv";
        String girlsNamesFile = "/Users/" + user + "/Desktop/girls_names.csv";
        String boysNamesFile = "/Users/" + user + "/Desktop/boys_names.csv";
        
        BufferedReader br = null;
        String line = "";
        
        try {
            br = new BufferedReader(new FileReader(surnamesFile));
            while((line = br.readLine()) != null) {
                String[] name = line.split(",");
                surnames.add(name[0]);
                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            br = new BufferedReader(new FileReader(girlsNamesFile));
            while((line = br.readLine()) != null) {
                String[] name = line.split(",");
                girlsNames.add(name[0]);
                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            br = new BufferedReader(new FileReader(boysNamesFile));
            while((line = br.readLine()) != null) {
                String[] name = line.split(",");
                boysNames.add(name[0]);
                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println(surnames.size());
        System.out.println(girlsNames.size());
        System.out.println(boysNames.size());
        
        for (int i = 0; i < 128; i++) {
            String month = months[0 + (int)(Math.random() * ((11 - 0) + 0))];
            System.out.println(month);
            
            int Date = 1;
            if (month == "Feb") {
                Date = 1 + (int)(Math.random() * ((28 - 1) + 1));
            } else if (month == "Apr" || month == "June" || month == "Sept" || month == "Nov") {
                Date = 1 + (int)(Math.random() * ((30 - 1) + 1));
            } else {
                Date = 1 + (int)(Math.random() * ((31 - 1) + 1));
            }
            
            System.out.println(Date);
            
        }
        
        
        PersonCreator pc = new PersonCreator();
        pc.createPerson("Anastasia", "Aleksandrova", "Female", "This is a message", "3", "Apr", "1836");
        pc.createPerson("Bill", "Cosby", "Male", "This is a message", "12", "July", "1937");


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
