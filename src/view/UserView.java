package dto;

public class TelDto {
    private Long id;  // 4L
    private String name;
    private int age;
    private String address;
    private String telNumber;

    public TelDto(Long id, String name, int age, String address, String telNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
                ", address='" + address + '\'' +
                ", telNumber='" + telNumber + '\'' +
                '}';
    }
}김형민  [오전 10:45]
private final Scanner scanner;

public UserView(Scanner scanner) {
    this.scanner = scanner;
}

public void insert() throws MyException{
    // 검증 클래스 생성
    InputValidation validation = new InputValidation();
    // 입력자료 저장을 위한 변수 선언
    String name;
    int age;
    String phone;
    String address;

    // 이름, 나이, 전화번호, 주소
    System.out.println("== 전화번호 등록 ==");
    // 이름 옳바른 값이 들어올 때 까지 반복
    boolean nameOk = false;
    do {
        try {
            // 이름 : 무조건 한글만.. 중간공백 없이
            System.out.println("이름 : ");
            name = scanner.next();
            validation.nameCheck(name);
            nameOk = true;
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    } while (! nameOk);

    // 나이 : 0세 ~ 120세 사이값
    boolean ageOk = false;
    do {
        try {
            System.out.println("나이 : ");
            age = scanner.nextInt();
            validation.ageCheck(age);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    } while (! ageOk);

    // 주소
    System.out.println("주소 : ");
    address = scanner.next();

    // 전화번호(010-XXXX-XXXX)
    boolean phoneOk = false;
    do {
        try {
            System.out.println("전화번호 : ");
            phone = scanner.next();
            validation.phoneCheck(phone);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    } while (! phoneOk);
}