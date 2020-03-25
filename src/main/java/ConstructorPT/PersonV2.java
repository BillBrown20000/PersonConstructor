package ConstructorPT;

public class PersonV2 {
    private String name;
    private int age;
    private String faveoriteSport;
    private String occupation;
    private int salary;

    public PersonV2(String name, int age, String faveoriteSport, String occupation, int salary){
        this.name = name;
        this.age = age;
        this.faveoriteSport = faveoriteSport;
        this.occupation = occupation;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFaveoriteSport() {
        return faveoriteSport;
    }
    public void setFaveoriteSport(String faveoriteSport) {
        this.faveoriteSport = faveoriteSport;
    }
    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
        public String PrintMethod(){
        return "My Name is " + name + " and I am " + age + " years old. My favorite sport is "
                + faveoriteSport + " and by this time next year my occupation will be "
                + occupation + " meaning I could be making up to " + salary + " yearly";
    }
        public int yearlybonus(int x ){
        return salary + x;
    }

    @Override
    public String toString() {
        return "PersonV2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", faveoriteSport='" + faveoriteSport + '\'' +
                ", occupation='" + occupation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
