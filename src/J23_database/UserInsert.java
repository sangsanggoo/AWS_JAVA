package J23_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import usermanagement.entity.User;



public class UserInsert {
	   public int saveUser(User user) {
		      int successCount = 0;
		      DBConnectionMgr pool = DBConnectionMgr.getInstance(); 
		      String sql = null;
		      Connection connection = null;
		      PreparedStatement preparedStatement = null;   
		      ResultSet resultSet = null;
		      
		      
		      try {
		         connection = pool.getConnection(); // try,catch로 예외처리

		         sql = "insert into user_mst\r\n" + "values (0, ?,?,?,?)";

		         preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); // text 에디터
		         preparedStatement.setString(1, user.getUsername()); // (0, ?,?,?,?) 1번 물음표에 username
		         preparedStatement.setString(2, user.getPassword()); // 
		         preparedStatement.setString(3, user.getName());
		         preparedStatement.setString(4, user.getEmail());
		         // 적용된 행의 갯수 리턴
		         successCount = preparedStatement.executeUpdate(); // insert,update,delete 명령 실행.
		         
		         resultSet = preparedStatement.getGeneratedKeys();
		         
		         while(resultSet.next()) {
		            System.out.println("이번에 만들어진 user_id ket값" + resultSet.getInt(1));
		            user.setUserId(resultSet.getInt(1));
		         }
		         
		      } catch (Exception e) {
		         e.printStackTrace();
		      }
		      
		      return successCount;
		      }
		      
		      public static int saveRoles(Map<String, Object> map) {
		         int successCount = 0;
		         
		   
		         
		         return successCount;
		      }
		         
		   

		   public static void main(String[] args) {
		      UserInsert insert = new UserInsert();

		      User user = User.builder()
		            .username("ddd")
		            .password("1234")
		            .name("ddd")
		            .email("ddd@gmail.com")
		            .build();
		      System.out.println(user);
		      int successCount = insert.saveUser(user);
		      
		      System.out.println("쿼리 실행 성공: " + successCount + "건");
		      
		      System.out.println(user);
		      
		      /*===================================================*/
		      
		      List<Integer> rolesIdList = new ArrayList<>();
		      rolesIdList.add(2);
		      rolesIdList.add(3);
		      
		      Map<String, Object> map = new HashMap<>();
		      map.put("user", user);
		      map.put("roles", rolesIdList);
		      
		      
		      successCount = UserInsert.saveRoles(map);
		      
		   }
		}
	