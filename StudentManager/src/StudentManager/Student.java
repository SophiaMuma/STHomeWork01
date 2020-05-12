package StudentManager;
//私有字段包括：ID（int）、name(string)、birDate(string或者Java日期)、gender，分别表示学号、姓名、出生日期和性别
//为每个私有字段设置一对儿公有访问方法

public class Student {
    private int id;
    private String name;
    private String birDate;
    private String gender;

    public Student(){
    }

    public Student(int id,String name,String birDate,String gender){
        this.id=id;
        this.name=name;
        this.birDate=birDate;
        this.gender=gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirDate() {
        return birDate;
    }

    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "{ID: "+this.id+",name: "+this.name+",birDate: "+this.birDate+",gender: "+this.gender+"}";
    }
}