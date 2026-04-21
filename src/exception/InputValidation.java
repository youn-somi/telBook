package exception;

import java.util.regex.Pattern;

public class InputValidation {
    //이름검증: 한글만 허용 하도록 (공백허용안함- 김 형민x)
    //옳바른 예 : 김형민
    public void nameCheck(String name) throws MyException {
        //정규 표현식
        boolean check = Pattern.matches("^[ㄱ-ㅎ 가-힣]*$", name);
        //한글이 아닌 게 들어오면
        if (!check) {
            throw new MyException(" ※이름은 한글로 입력해주세요 ");
        }
    }
    //나이 검증 : 0~ 120대 까지 사이값이 들어와야함.
    public  void ageCheck(int age) throws MyException {
        if (age < 0 || age > 120) {
            throw  new MyException("※ 나이는 0 세 부터 120세 까지 입니다");
        }
    }
    //전화번호 검증  = 형식체크 (010-XXXX-XXXX)만 받는걸로
    //"-"도 반드시 필요
    public  void  phoneCheck(String phone) throws  MyException {
        boolean check = Pattern.matches("(010)-(//{4})- (//4})", phone);
        if (!check) {
            throw new MyException("※ 전화번호 형식은 [010- XXXX-XXXX]입니다.");
        }

    }
}
