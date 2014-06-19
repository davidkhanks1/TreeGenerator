/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treegenerator;

import java.util.ArrayList;
import java.util.List;
import org.gedcomx.conclusion.json.*;

/**
 *
 * @author davidkhanks
 */
public class TreeNode {
    private TreeNode father;
    private TreeNode mother;
    private TreeNode spouse;
    private List<TreeNode> children = new ArrayList();
    private Person person;
    
    
    
    public TreeNode() {
        
    }

    public TreeNode(Person person) {
        this.person = person;
    }

    /**
     * @return the father
     */
    public TreeNode getFather() {
        return father;
    }

    /**
     * @param father the father to set
     */
    public void setFather(TreeNode father) {
        this.father = father;
    }

    /**
     * @return the mother
     */
    public TreeNode getMother() {
        return mother;
    }

    /**
     * @param mother the mother to set
     */
    public void setMother(TreeNode mother) {
        this.mother = mother;
    }

    /**
     * @return the spouse
     */
    public TreeNode getSpouse() {
        return spouse;
    }

    /**
     * @param spouse the spouse to set
     */
    public void setSpouse(TreeNode spouse) {
        this.spouse = spouse;
    }

    /**
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(Person person) {
        this.person = person;
    }
    
    public boolean fatherExists() {
        if (this.father != null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean motherExists() {
        if (this.mother != null) {
            return true;
        } else {
            return false;
        }
    }
}
