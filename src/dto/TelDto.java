package dto;

public class TelDto {
    private   Long id; //4L
    private  String name;
    private  int age;
    private String adderess;
    private  String telNumber;

    public TelDto(Long id, String name, int age, String adderess, String telNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adderess = adderess;
        this.telNumber = telNumber;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
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

    public String getAdderess() {
        return adderess;
    }

    public void setAdderess(String adderess) {
        this.adderess = adderess;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    @Override
    public String toString() {
        return "TelDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", adderess='" + adderess + '\'' +
                ", telNumber='" + telNumber + '\'' +
                '}';
    }
}
