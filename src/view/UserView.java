package view;

import exception.InputValidation;
import exception.MyException;

import java.util.Scanner;

public class UserView {
    private final Scanner scanner;
    public  UserView(Scanner scanner){
        this.scanner = scanner;
    }
    public void insert() {
        //검증 클래스 생성
        InputValidation validation = new InputValidation();
        //입력자료 정장을 위한 변수 선언
        String name;
        int age;
        String phone;
        String address;


        //이름 , 나이 전화번호 , 주소
        System.out.println("==전화번호 등록==");
        //이름 옳바른 값이 들어올 떄 까지 반복
        boolean nameOk = false;
       do {
           try {
               //이름: 무조건 한글만.. 중간공백없이
               System.out.println("이름 : ");
               String name = scanner.next();
               validation.nameCheck(name);
               nameOk = true;
           } catch (MyException e) {
               System.out.println(e.getMessage());
           }
       } while (! nameOk);


        //나이 : 0세~120세 사이값
        boolean ageOK = false;
        do {
            try {
                System.out.println("나이 : ");
                age = scanner.nextInt();
            }catch (MyException){
            while (! ageOK)
        }
        System.out.println ("나이 : ");
        int age = scanner.nextInt();
    //주소
        System.out.println("주소 : ");
        String address = scanner.next();
    //전화번호 (010-XXXX-XXXX)
            boolean phoneOk = false;
            do {
                try {
                    System.out.println("전화번호 : ");
                    phone = scanner.next();
                    validation.phoneCheck(phone)
                    ;
                }catch (MyException e) {
                    System.out.println(MyException e);
                }
                    System.out.println ("전화번호 : ");
        String phone = scanner.next();
    }

    public void update() {
    }

    public void delete() {
    }

    public void searchAll() {
    }

    public void searchOne() {
    }
}
