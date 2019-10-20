/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Hansi
 */
public class Dbfile2 {

    String url = "jdbc:mysql://localhost:3306/mysqlsms";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs;
    int result;

    public boolean update1(File2nd dt) {

        try {
            System.out.println("add file1 1");
System.out.println(dt.getMothername());
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE file1  SET  motherid='" + dt.getIdnum()+ "',age='" + dt.getAge()+ "',2monthsms='"+dt.getMonth2sms()+ "'"
+ " WHERE motherid='" + dt.getIdnum()+ "'";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update 2");

            pst.executeUpdate();
            System.out.println("Updated queries: ");

            return true;
        } catch (Exception e) {
            System.out.println("exe" + e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
            }
        }

    }
    
     public boolean update2(File2nd dt) {

        try {
            System.out.println("add file1 1");
System.out.println(dt.getMothername());
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE file1  SET  motherid='" + dt.getIdnum()+ "',age='" + dt.getAge()+ "',4monthsms='"+dt.getMonth4sms()+ "'"
+ " WHERE motherid='" + dt.getIdnum()+ "'";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update 2");

            pst.executeUpdate();
            System.out.println("Updated queries: ");

            return true;
        } catch (Exception e) {
            System.out.println("exe" + e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
            }
        }

    }
     
      public boolean update3(File2nd dt) {

        try {
            System.out.println("add file1 1");
System.out.println(dt.getMothername());
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE file1  SET  motherid='" + dt.getIdnum()+ "',age='" + dt.getAge()+ "',6monthsms='"+dt.getMonth6sms()+ "'"
+ " WHERE motherid='" + dt.getIdnum()+ "'";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update 2");

            pst.executeUpdate();
            System.out.println("Updated queries: ");

            return true;
        } catch (Exception e) {
            System.out.println("exe" + e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
            }
        }

    }
      
       public boolean update4(File2nd dt) {

        try {
            System.out.println("add file1 1");
System.out.println(dt.getMothername());
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE file1  SET  motherid='" + dt.getIdnum()+ "',age='" + dt.getAge()+ "',9monthsms='"+dt.getMonth9sms()+ "'"
+ " WHERE motherid='" + dt.getIdnum()+ "'";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update 2");

            pst.executeUpdate();
            System.out.println("Updated queries: ");

            return true;
        } catch (Exception e) {
            System.out.println("exe" + e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
            }
        }

    }
        public boolean update5(File2nd dt) {

        try {
            System.out.println("add file1 1");
System.out.println(dt.getMothername());
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE file1  SET  motherid='" + dt.getIdnum()+ "',age='" + dt.getAge()+ "',1yearsms='"+dt.getYear1sms()+ "'"
+ " WHERE motherid='" + dt.getIdnum()+ "'";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update 2");

            pst.executeUpdate();
            System.out.println("Updated queries: ");

            return true;
        } catch (Exception e) {
            System.out.println("exe" + e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
            }
        }

    }
         public boolean update6(File2nd dt) {

        try {
            System.out.println("add file1 1");
System.out.println(dt.getMothername());
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE file1  SET  motherid='" + dt.getIdnum()+ "',age='" + dt.getAge()+ "',18monthsms='"+dt.getMonth18sms()+ "'"
+ " WHERE motherid='" + dt.getIdnum()+ "'";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update 2");

            pst.executeUpdate();
            System.out.println("Updated queries: ");

            return true;
        } catch (Exception e) {
            System.out.println("exe" + e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
            }
        }

    }
          public boolean update7(File2nd dt) {

        try {
            System.out.println("add file1 7");
System.out.println(dt.getMothername());
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE file1  SET  motherid='" + dt.getIdnum()+ "',age='" + dt.getAge()+ "',3yearsms='"+dt.getYear3sms()+ "'"
+ " WHERE motherid='" + dt.getIdnum()+ "'";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update 2");

            pst.executeUpdate();
            System.out.println("Updated queries: ");

            return true;
        } catch (Exception e) {
            System.out.println("exe" + e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
            }
        }

    }
           public boolean update8(File2nd dt) {

        try {
            System.out.println("add file1 1");
System.out.println(dt.getMothername());
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE file1  SET  motherid='" + dt.getIdnum()+ "',age='" + dt.getAge()+ "',5yearsms='"+dt.getYear5sms()+ "'"
+ " WHERE motherid='" + dt.getIdnum()+ "'";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update 2");

            pst.executeUpdate();
            System.out.println("Updated queries: ");

            return true;
        } catch (Exception e) {
            System.out.println("exe" + e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
            }
        }

    }

      public boolean update9(File2nd dt) {

        try {
            System.out.println("add file1 1");
System.out.println(dt.getMothername()
);
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE file1  SET  motherid='" + dt.getIdnum()+ "',age='" + dt.getAge()+ "',12yearsms='"+dt.getYear12sms()+ "'"
+ " WHERE motherid='" + dt.getIdnum()+ "'";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update 2");

            pst.executeUpdate();
            System.out.println("Updated queries: ");

            return true;
        } catch (Exception e) {
            System.out.println("exe" + e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
            }
        }

    }
}
