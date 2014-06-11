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
public enum FactType {
    ADOPTION("http://gedcomx.org/Adoption"), ADULTCHRISTENING("http://gedcomx.org/AdultChristening"), AMNESTY("http://gedcomx.org/Amnesty"), APPRENTICESHIP("http://gedcomx.org/Apprenticeship"), 
    ARREST("http://gedcomx.org/Arrest"), BAPTISM("http://gedcomx.org/Baptism"), BARMITZVAH("http://gedcomx.org/BarMitzvah"), BATMITZVAH("http://gedcomx.org/BatMitzvah"), 
    BIRTH("http://gedcomx.org/Birth"), BLESSING("http://gedcomx.org/Blessing"), BURIAL("http://gedcomx.org/Burial"), CASTE("http://gedcomx.org/Caste"), CENSUS("http://gedcomx.org/Census"), 
    CHRISTENING("http://gedcomx.org/Christening"), CIRCUMCISION("http://gedcomx.org/Circumcision"), CLAN("http://gedcomx.org/Clan"), CONFIRMATION("http://gedcomx.org/Confirmation"), 
    CREMATION("http://gedcomx.org/Cremation"), DEATH("http://gedcomx.org/Death"), EDUCATION("http://gedcomx.org/Education"), EDUCATIONENROLLMENT("http://gedcomx.org/EducationEnrollment"), 
    EMIGRATION("http://gedcomx.org/Emigration"), ETHNICITY("http://gedcomx.org/Ethnicity"), EXCOMMUNICATION("http://gedcomx.org/Excommunication"), FIRSTCOMMUNION("http://gedcomx.org/FirstCommunion"), 
    FUNERAL("http://gedcomx.org/Funeral"), GENDERCHANGE("http://gedcomx.org/GenderChange"), GRADUATION("http://gedcomx.org/Graduation"), IMMIGRATION("http://gedcomx.org/Immigration"), 
    IMPRISONMENT("http://gedcomx.org/Imprisonment"), LANDTRANSACTION("http://gedcomx.org/LandTransaction"), LANGUAGE("http://gedcomx.org/Language"), LIVING("http://gedcomx.org/Living"), 
    MARITALSTATUS("http://gedcomx.org/MaritalStatus"), MEDICAL("http://gedcomx.org/Medical"), MILITARYAWARD("http://gedcomx.org/MilitaryAward"), MILITARYDISCHARGE("http://gedcomx.org/MilitaryDischarge"), 
    MILITARYDRAFTREGISTRATION("http://gedcomx.org/MilitaryDraftRegistration"), MILITARYINDUCTION("http://gedcomx.org/MilitaryInduction"), MILITARYSERVICE("http://gedcomx.org/MilitaryService"), 
    MISSION("http://gedcomx.org/Mission"), MOVEFROM("http://gedcomx.org/MoveFrom"), MOVETO("http://gedcomx.org/MoveTo"), MULTIPLEBIRTH("http://gedcomx.org/MultipleBirth"), NATIONALID("http://gedcomx.org/NationalId"), 
    NATIONALITY("http://gedcomx.org/Nationality"), NATURALIZATION("http://gedcomx.org/Naturalization"), NUMBEROFMARRIAGES("http://gedcomx.org/NumberOfMarriages"), OCCUPATION("http://gedcomx.org/Occupation"), 
    ORDINATION("http://gedcomx.org/Ordination"), PARDON("http://gedcomx.org/Pardon"), PHYSICALDESCRIPTION("http://gedcomx.org/PhysicalDescription"), PROBATE("http://gedcomx.org/Probate"), PROPERTY("http://gedcomx.org/Property"), 
    RELIGION("http://gedcomx.org/Religion"), RESIDENCE("http://gedcomx.org/Residence"), RETIREMENT("http://gedcomx.org/Retirement"), STILLBIRTH("http://gedcomx.org/Stillbirth"), TAXASSESSMENT("http://gedcomx.org/TaxAssessment"), 
    WILL("http://gedcomx.org/Will"), VISITY("http://gedcomx.org/Visit"), YAHRZEIT("http://gedcomx.org/Yahrzeit"), ANNULMENT("http://gedcomx.org/Annulment"), COMMONLAWMARRIAGE("http://gedcomx.org/CommonLawMarriage"), 
    CIVILUNION("http://gedcomx.org/CivilUnion"), DIVORCE("http://gedcomx.org/Divorce"), DIVORCEFILING("http://gedcomx.org/DivorceFiling"), DOMESTICPARTNERSHIP("http://gedcomx.org/DomesticPartnership"), 
    ENGAGEMENT("http://gedcomx.org/Engagement"), MARRIAGE("http://gedcomx.org/Marriage"), MARRIAGEBANNS("http://gedcomx.org/MarriageBanns"), MARRIAGECONTRACT("http://gedcomx.org/MarriageContract"), 
    MARRIAGELICENSE("http://gedcomx.org/MarriageLicense"), MARRIAGENOTICE("http://gedcomx.org/MarriageNotice"), NUMBEROFCHILDREN("http://gedcomx.org/NumberOfChildren"), SEPARATION("http://gedcomx.org/Separation"), 
    ADOPTIVEPARENT("http://gedcomx.org/AdoptiveParent"), BIOLOGICALPARENT("http://gedcomx.org/BiologicalParent"), FOSTERPARENT("http://gedcomx.org/FosterParent"), GUARDIANPARENT("http://gedcomx.org/GuardianParent"), 
    STEPPARENT("http://gedcomx.org/StepParent"), SOCIOLOGICALPARENT("http://gedcomx.org/SociologicalParent");
    
    private String factType;
    
    private FactType(String factType) {
        this.factType = factType;
    }
    
    public String getFactType() {
        return factType;
    }
    
}
