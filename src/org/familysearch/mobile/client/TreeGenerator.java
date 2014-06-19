/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.familysearch.mobile.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.familysearch.platform.ct.json.*;
import org.gedcomx.conclusion.json.*;
import org.gedcomx.common.json.*;
import org.gedcomx.types.json.*;

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
        
//        System.out.println("Surname size: " + surnames.size());
//        System.out.println("girlsname size: " + girlsNames.size());
//        System.out.println("boysname size: " + boysNames.size());
        
//        for (int i = 0; i < 3; i++) {
//            
//            String month = getRandMonth();
//            int date = getRandDate(month);
//            
//            System.out.println(month + " " + date);
//            
//        }
        
        
        
        
        PersonCreator pc = new PersonCreator();
        pc.createPerson("Anastasia", "Aleksandrova", "Female", "This is a message", "3", "Apr", "1836");
        pc.createPerson("Bill", "Cosby", "Male", "This is a message", "12", "July", "1937");
        
        List<Person> people = pc.getPersons();
        

        TreeNode basePerson = new TreeNode(people.get(0));
        TreeNode baseSpouse = new TreeNode(people.get(1));
        basePerson.setSpouse(baseSpouse);
        baseSpouse.setSpouse(basePerson);
        
//        System.out.println(basePerson.getSpouse().getPerson().getNames().get(0).getNameForms().get(0).getFullText());
//        System.out.println(basePerson.getSpouse().getPerson().getNames().get(0).getNameForms().get(0).getParts().get(1).getValue());
//        System.out.println(basePerson.getPerson().getFacts().get(0).getDate().getFormal().substring(1));
        
        
        
//        System.out.println(basePerson.getFather().getFather().getFather().getFather().getFather().getFather().getFather().getPerson().getNames().get(0).getNameForms().get(0).getFullText());
//        System.out.println(basePerson.getFather().getFather().getFather().getFather().getFather().getFather().getMother().getPerson().getFacts().get(0).getDate().getFormal().substring(1));
//        System.out.println(basePerson.getFather().getFather().getFather().getFather().getFather().getFather().getMother().getPerson().getAnalysis().getResource());
        populateTree(6, basePerson, pc);
        printTree(basePerson);


        
        JSONPrinter(pc, "Person");
        
        for (int i = 0; i < pc.getPersons().size(); i++) {
            System.out.println("Name: " + pc.getPersons().get(i).getNames().get(0).getNameForms().get(0).getFullText());
            createPersonAPICall(pc.getPersons().get(i));
            System.out.println("ResourceID: " + pc.getPersons().get(i).getAnalysis().getResourceId());
        }
          
        
    }
    
    /**
     * Randomly selects a month and returns it as a string
     * @return month the randomly chosen month
     */
    public String getRandMonth() {
        String month = months[0 + (int)(Math.random() * ((11 - 0) + 1))];
        return month;
    }
    
    /**
     * Randomly returns a date based on the month that was passed in as a parameter
     * @param month the month is needed to know where the limit is i.e. February only has 28 days
     * @return 
     */
    public int getRandDate(String month) {
        int date = 1;
        if (month == "Feb") {
            date = 1 + (int)(Math.random() * ((28 - 1) + 1));
        } else if (month == "Apr" || month == "June" || month == "Sept" || month == "Nov") {
            date = 1 + (int)(Math.random() * ((30 - 1) + 1));
        } else {
            date = 1 + (int)(Math.random() * ((31 - 1) + 1));
        }
        
        return date;
    }
    
    /**
     * Recursively generates a pedigree, given a person to start with and the number of generations to run
     * @param count the number of generations that are desired
     * @param base the starting person of the pedigree
     * @param pc the person creator object that creates each person and adds each person object
     * to its list as to be able to iterate quickly through all people in the pedigree
     */
    public void populateTree(int count, TreeNode base, PersonCreator pc) {
        
        if (count < 1) {
            return;
        }
        String fatherFirst = boysNames.get(0 + (int)(Math.random() * ((719 - 0) + 1)));
        fatherFirst = fatherFirst.replace("\"", "");
        String motherFirst = girlsNames.get(0 + (int)(Math.random() * ((719 - 0) + 1)));
        motherFirst = motherFirst.replace("\"", "");
        String surname = surnames.get(0 + (int)(Math.random() * ((1000 - 0) + 1)));
        
        String month = getRandMonth();
        int date = getRandDate(month);
        
        String formalYear = base.getPerson().getFacts().get(0).getDate().getFormal().substring(1);
        int year = Integer.parseInt(formalYear);
        year = year - (16 + (int)(Math.random() * ((45 - 16) + 1)));
        String inputYear = Integer.toString(year);
        
        String birthDate = Integer.toString(date);
        
        if (!base.fatherExists()) {
            TreeNode father = new TreeNode();
            father.setPerson(pc.createPerson(fatherFirst, base.getPerson().getNames().get(0).getNameForms().get(0).getParts().get(1).getValue(), "Male", "This is a message", birthDate, month, inputYear));
            base.setFather(father);
            populateTree(count - 1, father, pc);
        }
        
        
        month = getRandMonth();
        date = getRandDate(month);
        
        birthDate = Integer.toString(date);
        
        if (!base.motherExists()) {
            TreeNode mother = new TreeNode();
            mother.setPerson(pc.createPerson(motherFirst, surname, "Female", "This is a message", birthDate, month, inputYear));
            base.setMother(mother);
            populateTree(count - 1, mother, pc);
        }
        
        base.getFather().setSpouse(base.getMother());
        base.getMother().setSpouse(base.getFather());
      
    }
    
    /**
     * Prints out all generations in the pedigree given a TreeNode obj
     * @param base the starting node
     */
    public void printTree(TreeNode base) {
        boolean printFather = false;
        boolean printMother = false;
        
        System.out.println("Person: " + base.getPerson().getNames().get(0).getNameForms().get(0).getFullText());
        if(base.fatherExists()) {
            System.out.println("Father: " + base.getFather().getPerson().getNames().get(0).getNameForms().get(0).getFullText());
            printFather = true;
        }
        
        if(base.motherExists()) {
            System.out.println("Mother: " + base.getMother().getPerson().getNames().get(0).getNameForms().get(0).getFullText());
            printMother = false;
        }
        
        System.out.println();
        if(printFather || printMother) {
            printTree(base.getFather());
            printTree(base.getMother());
        }
        
    }
    
    
    /**
     * Takes any object and creates a JSON string of that object and prints it out to a file
     * @param obj the Object to be printed to a JSON file
     * @param fileName the name of the file without the extension 
     */
    public void JSONPrinter(Object obj, String fileName) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();


        String json = gson.toJson(obj);
        
        json.replace("g", "G");

        try {
            FileWriter writer = new FileWriter("/Users/davidkhanks/Desktop/" + fileName + ".json");
            writer.write(json);
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void createPersonAPICall(Person p) {
        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(p);
        // TODO Jersey call to the API passing a JSON string and getting the created PID from the response
        int n1 = 0 + (int)(Math.random() * ((9 - 0) + 1));
        String num1 = Integer.toString(n1);
        int n2 = 0 + (int)(Math.random() * ((9 - 0) + 1));
        String num2 = Integer.toString(n2);
        int n3 = 0 + (int)(Math.random() * ((9 - 0) + 1));
        String num3 = Integer.toString(n3);
        String response = "TEST-" + num1 + num2 + num3;
        
        try {
            p.getAnalysis().setResource("https://familysearch.org/platform/tree/persons/" + response);
            p.getAnalysis().setResourceId(response);
        } catch(NullPointerException e) {
            ResourceReference rr = new ResourceReference();
            p.setAnalysis(rr);
            p.getAnalysis().setResource("https://familysearch.org/platform/tree/persons/" + response);
            p.getAnalysis().setResourceId(response);
        }
        
        
    }
    
    public void createRelationshipAPICall(Person p1, Person p2) {
        Relationship rel = new Relationship();
        rel.setType(RelationshipType.Couple.toString());
        rel.setPerson1(p1.getAnalysis());
        rel.setPerson2(p2.getAnalysis());
        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(rel);
        // TODO Jersey call to the API passing a JSON relationship string and getting the created PID from the response
        
    }

    
}
