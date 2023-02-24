// use implements instead of extends if there is a dashed line
public class Course{
    private String code;
    private String number;
    private String name;

    public Course(String code, String number, String name){
        this.code = code;
        this.number = number;
        this.name = name;
    }

    public String toString(){
        return code + " " + number + " " + name "\n";
    }
}
