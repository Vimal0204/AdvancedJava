public class Employee implements java.io.Serializable{
    private int id;
    private String name;
    private int sal;
    public Employee(){}
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSal(int sal){
        this.sal=sal;
    }
    public int getSal(){return sal;}

}
