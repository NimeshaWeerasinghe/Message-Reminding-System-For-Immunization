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
public class Dbfile {
    
     String url = "jdbc:mysql://localhost:3306/mysqlsms";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs;
   int result ;
    
    
    
    int total;
   // Update4ncard upd=new Update4ncard();
    
    
    
    
    public boolean add(File2nd dt){
    
        try {
            System.out.println("add file1 1");

            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "INSERT INTO file1 VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("add file1 2");

            
            pst.setInt(1, dt.getRegid());//add valyes to the sql quary
            pst.setString(2, dt.getDate());//add valyes to the sql quary
           // pst.setInt(3, ad4n.getYear());//add valyes to the sql quary
            pst.setString(3, dt.getBabyname());//add valyes to the sql quary
            pst.setString(4, dt.getMothername());//add valyes to the sql quary
            pst.setString(5, dt.getIdnum());//add valyes to the sql quary
            pst.setString(6, dt.getDateofbirth());//add valyes to the sql quary
            pst.setString(7, dt.getSex());
            pst.setString(8, dt.getAddress());//add valyes to the sql quary
            pst.setInt(9, dt.getTphm());//add valyes to the sql quary
            pst.setInt(10, dt.getTpmob());//add valyes to the sql quary
            pst.setString(11, dt.getAge());
           // pst.setString(10, dt.getSms());
            pst.setString(12, dt.getMonth2sms());
            pst.setString(13, dt.getMonth4sms());
            pst.setString(14, dt.getMonth6sms());
            pst.setString(15, dt.getMonth9sms());
            pst.setString(16, dt.getYear1sms());
            pst.setString(17, dt.getMonth18sms());
            pst.setString(18, dt.getYear3sms());
            pst.setString(19, dt.getYear5sms());
            pst.setString(20, dt.getYear12sms());
            System.out.println("addfile 3");
            pst.executeUpdate();//excute the sql quary & insert the values to the db table
            System.out.println("add 4");
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

    ArrayList<File2nd> getFile2nd() {
        try {
            ArrayList<File2nd> list = new ArrayList<File2nd>();

            System.out.println("get 1");
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "SELECT * FROM file1";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("get 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                File2nd p = new File2nd();
                p.setRegid(rs.getInt(1));
                p.setDate(rs.getString(2));
               // p.setMonth(rs.getString(2));
               // p.setYear(rs.getInt(3));
                p.setBabyname(rs.getString(3));
                 p.setMothername(rs.getString(4));
                 p.setIdnum(rs.getString(5));
                p.setDateofbirth(rs.getString(6));
                p.setSex(rs.getString(7));
                p.setAddress(rs.getString(8));
                p.setTphm(rs.getInt(9));
                p.setTpmob(rs.getInt(10));
                p.setAge(rs.getString(11));
                p.setMonth2sms(rs.getString(12));
                p.setMonth4sms(rs.getString(13));
                p.setMonth6sms(rs.getString(14));
                p.setMonth9sms(rs.getString(15));
                p.setYear1sms(rs.getString(16));
                p.setMonth18sms(rs.getString(17));
                p.setYear3sms(rs.getString(18));
                p.setYear5sms(rs.getString(19));
                p.setYear12sms(rs.getString(20));
                list.add(p);
                System.out.println("get 3");
            }
            return list;

        } catch (Exception e) {
            System.out.println("exe" + e);
            return null;

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

    
    
      public boolean update(File2nd em) {
        try {
            System.out.println("update 1");
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE file1 "
                    + " SET date='" + em.getDate()+ "', babyname='" + em.getBabyname()+ "', mothername='" + em.getMothername()+ "',motherid='" + em.getIdnum()+ "',dateofbirth='" + em.getDateofbirth()+ "',sex='"+em.getSex()+"',address='" + em.getAddress()+ "'"
                    + ", tphm=" + em.getTphm()+ ", tpmob=" + em.getTpmob()+ ",age='" + em.getAge()+ "'"
                    + " WHERE motherid='" + em.getIdnum()+ "'";
                    
                    

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update 2 file1");
            
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
      
      
      
      public boolean delete(File2nd em) {
        try {
            System.out.println("delete 1");
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "DELETE FROM file1 WHERE motherid='" + em.getIdnum()+ "'";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("delete 2");

            pst.executeUpdate();
            System.out.println("delete 3");
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
