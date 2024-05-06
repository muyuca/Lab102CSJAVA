package CS102_LAB8;

public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private Character gender;
    private int birthyear;
    private String profession;

    public Person(String ID, String firtName, String lastName, Character gender, int birthyear, String profession){
        this.ID=ID;
        this.firstName=firtName;
        this.lastName=lastName;
        this.gender=gender;
        this.birthyear=birthyear;
        this.profession=profession;
    }
    public String getID(){
        return this.ID;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public Character getGender(){
        return this.gender;
    }
    public int getBirthyear(){
        return this.birthyear;
    }
    public String getProfession(String profession){
        return this.profession;
    }
    public void setID(String ID){
        this.ID=ID;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setGender(Character gender){
        this.gender=gender;
    }
    public void setBirthYear(int birthyear){
        this.birthyear=birthyear;
    }
    public void setProfession(String proffesion){
        this.profession=profession;
    }
    public String toString() {
        String format = "%-11s%-14s%-14s(%c, %d) %s";
        return String.format(format, ID, firstName, lastName, gender, birthyear, profession);
    }




}
