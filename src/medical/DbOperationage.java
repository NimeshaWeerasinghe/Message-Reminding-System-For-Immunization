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
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Hansi
 */
public class DbOperationage {

    
     String url = "jdbc:mysql://localhost:3306/mysqlsms";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs;
    int result;
    
     public boolean update1(Details dt) {

        try {
            System.out.println("add file1 1");
//System.out.println(dt.getName());
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE details  SET  motherid='" + dt.getIdNum()+ "',month2sms='"+dt.getMonth2sms()+ "'"
+ " WHERE motherid='" + dt.getIdNum()+ "'";

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
    
     public boolean update2(Details dt) {

        try {
            System.out.println("add file1 1");
//System.out.println(dt.getName());
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE details  SET motherid='" + dt.getIdNum()+ "',month4sms='"+dt.getMonth4sms()+ "'"
+ " WHERE motherid='" + dt.getIdNum()+ "'";

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
     
      public boolean update3(Details dt) {

        try {
            System.out.println("add file1 1");
System.out.println(dt.getMothername());
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE details  SET  motherid='" + dt.getIdNum()+ "',month6sms='"+dt.getMonth6sms()+ "'"
+ " WHERE motherid='" + dt.getIdNum()+ "'";

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
      
       public boolean update4(Details dt) {

        try {
            System.out.println("add file1 1");
System.out.println(dt.getMothername());
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE details  SET  motherid='" + dt.getIdNum()+ "',month9sms='"+dt.getMonth9sms()+ "'"
+ " WHERE motherid='" + dt.getIdNum()+ "'";

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
        public boolean update5(Details dt) {

        try {
            System.out.println("add file1 1");
System.out.println(dt.getMothername());
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE details  SET  motherid='" + dt.getIdNum()+ "',year1sms='"+dt.getYear1sms()+ "'"
+ " WHERE motherid='" + dt.getIdNum()
                    + "'";

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
         public boolean update6(Details dt) {

        try {
            System.out.println("add file1 1");
System.out.println(dt.getMothername());
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE details  SET  motherid='" + dt.getIdNum()+ "',month18sms='"+dt.getMonth18sms()+ "'"
+ " WHERE motherid='" + dt.getIdNum()+ "'";

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
          public boolean update7(Details dt) {

        try {
            System.out.println("add file1 7");
System.out.println(dt.getMothername());
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE details  SET  motherid='" + dt.getIdNum()+ "',year3sms='"+dt.getYear3sms()+ "'"
+ " WHERE motherid='" + dt.getIdNum()+ "'";

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
           public boolean update8(Details dt) {

        try {
            System.out.println("add file1 1");
System.out.println(dt.getMothername());
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE details  SET  motherid='" + dt.getIdNum()+ "',year5sms='"+dt.getYear5sms()+ "'"
+ " WHERE motherid='" + dt.getIdNum()+ "'";

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

      public boolean update9(Details dt) {

        try {
            System.out.println("add file1 1");
System.out.println(dt.getMothername());
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE details  SET  motherid='" + dt.getIdNum()+ "',year12sms='"+dt.getYear12sms()+ "'"
+ " WHERE motherid='" + dt.getIdNum()+ "'";

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