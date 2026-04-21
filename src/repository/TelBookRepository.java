package repository;

import db.DBConn;
import dto.TelDto;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TelBookRepository {
    public int insertData(TelDto dto) {
        //1. DB연결
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;

        // 2. 쿼리 생성
        //실행결과를 담을 변수
        int result = 0;
        try {
             String sql = "INSERT INTO telbook (name, age, address, phone) VALUES (?,?,?,?)";
             psmt = conn.prepareStatement(sql);
             psmt.setString(1,dto.getName());
             psmt.setInt(2,dto.getAge());
             psmt.setString(3, dto.getAdderess());
             psmt.setString(4, dto.getTelNumber());
             result = psmt.executeUpdate();
             psmt.close();
        } catch (Exception e) {
            System.out.println("INSERT 오류 : " + e.getMessage());
        }
        return = result

        //3. 쿼리 실행
        //4. 정리

    }
}
