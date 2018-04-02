//sudo apt-get install libmysql-java
export CLASSPATH=$CLASSPATH:/usr/share/java/mysql-connector-java.jar


import java.sql.*;
public class java1
{

  public static void main(String[] args)
  {
    try
    {
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost/student";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "r3547", "ramya3547");
      String query = "SELECT * FROM student";
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(query);
        System.out.println("ID\tNAME\t\tAGE\tSUB1\tSUB2\tSUB3\n");
      while (rs.next())
      {
        int ID = rs.getInt("ID");
        String NAME = rs.getString("NAME");
        int AGE = rs.getInt("AGE");
        int SUB1 =rs.getInt("SUB1");
        int SUB2 =rs.getInt("SUB2");
        int SUB3 =rs.getInt("SUB3");
        System.out.format("%s\t%s\t\t%s\t%s\t%s\t%s\t\n",ID,NAME,AGE,SUB1,SUB2,SUB3);
      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
  }
}

