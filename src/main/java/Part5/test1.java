package Part5;

import com.yzk18.commons.CommonHelpers;
import com.yzk18.commons.JDBCExecutor;
import com.yzk18.commons.JDBCRow;

import java.util.List;

public class test1 {
    public static void main(String[] args) {
        JDBCExecutor jdbcExecutor=new JDBCExecutor("jdbc:sqlite:C:/Users/PC/Desktop/数据库试验存储/test1.db",null,null);
//        jdbcExecutor.execute("insert into T_Authors(Name,Age) values('诸葛亮2',18)");
//        List<JDBCRow> rows=jdbcExecutor.query("select * from T_Authors");
//        for (JDBCRow row : rows){
//            long id=row.getLong("Id");
//            String name=row.getString("Name");
//            int age=row.getInt("Age");
//            System.out.println("Id="+id+",Name="+name+",Age="+age);
//        }
//        List<Author> authors=jdbcExecutor.query(Author.class,"select * from T_Authors where Age>15");
//        for (Author a:authors){
//            System.out.println(a);
//        }
//        System.out.println("请输入姓名");
//        String name= CommonHelpers.readLine();
//        System.out.println("请输入年龄");
//        int age= CommonHelpers.readInt();
//        String sql="insert into T_Authors(Name,Age) values('"+name+"',"+age+")";
//        System.out.println(sql);
//        jdbcExecutor.execute(sql);
        System.out.println("请输入用户名");
        String userName = CommonHelpers.readLine();
        System.out.println("请输入密码");
        String password = CommonHelpers.readLine();
//        String sql="select * from Users where UserName='"+userName+"' and Password='"+password+"'";
//        System.out.println(sql);
//        List<JDBCRow> rows = jdbcExecutor.query(sql);
        List<JDBCRow> rows = jdbcExecutor.query("select * from Users where UserName=? and Password=?",userName,password);
        if(rows.size()==0)
        {
            System.out.println("登录失败");
        }
        else
        {
            System.out.println("登录成功");
        }
    }
}
