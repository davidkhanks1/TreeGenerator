/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treegenerator;

/**
 *
 * @author davidkhanks
 */
public class PersonData {
    private String firstName;
    private String lastname;
    private String gender;
    private String message;
    private String birthDate;
    private String birthMonth;
    private String birthYear;
    
    public PersonData() {
        
    }
    
    public PersonData(String firstName, String lastName, String gender, String message, String birthDate, String birthMonth, String birthYear) {
        this.firstName = firstName;
        this.lastname = lastName;
        this.gender = gender;
        this.message = message;
        this.birthDate = birthDate;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the birthMonth
     */
    public String getBirthMonth() {
        return birthMonth;
    }

    /**
     * @param birthMonth the birthMonth to set
     */
    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    /**
     * @return the birthYear
     */
    public String getBirthYear() {
        return birthYear;
    }

    /**
     * @param birthYear the birthYear to set
     */
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }
}
