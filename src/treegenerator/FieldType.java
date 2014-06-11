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
public enum FieldType {
    AGE("http://gedcomx.org/Age"), DATE("http://gedcomx.org/Date"), PLACE("http://gedcomx.org/Place"), GENDER("http://gedcomx.org/Gender"), NAME("http://gedcomx.org/Name"), ROLE("http://gedcomx.org/Role")
    , YEARS("http://gedcomx.org/Years"), MONTHS("http://gedcomx.org/Months"), DAYS("http://gedcomx.org/Davs"), HOURS("http://gedcomx.org/Hours"), MINUTES("http://gedcomx.org/Minutes"),
    YEAR("http://gedcomx.org/Year"), MONTH("http://gedcomx.org/Month"), DAY("http://gedcomx.org/Day"), HOUR("http://gedcomx.org/Hour"), MINUTE("http://gedcomx.org/Minute"), ADDRESS("http://gedcomx.org/Address")
    , CEMETERY("http://gedcomx.org/Cemetery"), CITY("http://gedcomx.org/City"), CHURCH("http://gedcomx.org/Church"), COUNTY("http://gedcomx.org/County"), DISTRICT("http://gedcomx.org/District"),
     HOSPITAL("http://gedcomx.org/Hospital"), ISLAND("http://gedcomx.org/Island"), MILITARYBASE("http://gedcomx.org/MilitaryBase"), MORTUARY("http://gedcomx.org/Mortuary"), PARISH("http://gedcomx.org/Parish"),
    PLOTNUMBER("http://gedcomx.org/PlotNumber"), POSTOFFICE("http://gedcomx.org/PostOffice"), POSTALCODE("http://gedcomx.org/PostalCode"), PRISON("http://gedcomx.org/Prison"), PROVINCE("http://gedcomx.org/Province"),
    SECTION("http://gedcomx.org/Section"), SHIP("http://gedcomx.org/Ship"), STATE("http://gedcomx.org/State"), TERRITORY("http://gedcomx.org/Territory"), TOWN("http://gedcomx.org/Town"), TOWNSHIP("http://gedcomx.org/Township"), 
    WARD("http://gedcomx.org/Ward"), PREFIX("http://gedcomx.org/Prefix"), SUFFIX("http://gedcomx.org/Suffix"), GIVEN("http://gedcomx.org/Given"), SURNAME("http://gedcomx.org/Surname"), ABUSUA("http://gedcomx.org/Abusua"), 
    BATCHNUMBER("http://gedcomx.org/BatchNumber"), CASTE("http://gedcomx.org/Caste"), CLAN("http://gedcomx.org/Clan"), COMMONLAWMARRIAGE("http://gedcomx.org/CommonLawMarriage"), EDUCATION("http://gedcomx.org/Education"), 
    ETHNICITY("http://gedcomx.org/Ethnicity"), FATHERBIRTHPLACE("http://gedcomx.org/FatherBirthPlace"), NEVERHADCHILDREN("http://gedcomx.org/NeverHadChildren"), NEVERMARRIED("http://gedcomx.org/NeverMarried"), 
    NUMBEROFCHILDREN("http://gedcomx.org/NumberOfChildren"), NUMBEROFMARRIAGES("http://gedcomx.org/NumberOfMarriages"), HOUSEHOLD("http://gedcomx.org/Household"), ISHEADOFHOUSEHOLD("http://gedcomx.org/IsHeadOfHousehold"), 
    MARITALSTATUS("http://gedcomx.org/MaritalStatus"), MOTHERBIRTHPLACE("http://gedcomx.org/MotherBirthPlace"), MULTIPLEBIRTH("http://gedcomx.org/MultipleBirth"), NAMESAKE("http://gedcomx.org/NameSake"), 
    NATIONALID("http://gedcomx.org/NationalId"), NATIONALITY("http://gedcomx.org/Nationality"), OCCUPATION("http://gedcomx.org/Occupation"), PHYSICALDESCRIPTION("http://gedcomx.org/PhysicalDescription"), 
    PROPERTY("http://gedcomx.org/Property"), RACE("http://gedcomx.org/Race"), RELIGION("http://gedcomx.org/Religion"), RELATIONSHIPTOHEAD("http://gedcomx.org/RelationshipToHead"), STILLBIRTH("http://gedcomx.org/Stillbirth"), 
    TITLEOFNOBILITY("http://gedcomx.org/TitleOfNobility"), TRIBE("http://gedcomx.org/Tribe");
    
    private String fieldType;
    
    private FieldType(String fieldType) {
        this.fieldType = fieldType;
    }
    
    public String getFieldType() {
        return fieldType;
    }
}
