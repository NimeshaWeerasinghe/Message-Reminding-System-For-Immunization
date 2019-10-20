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
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Hansi
 */
public class DBShow {

    String url = "jdbc:mysql://localhost:3306/mysqlsms";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs;
    int result;

    ArrayList<AgeInfo> getDetails1() {

        try {
            ArrayList<AgeInfo> list1 = new ArrayList<AgeInfo>();
            System.out.println("show4n1 1");
            ArrayList<AgeInfo> agList = new ArrayList<AgeInfo>();
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "SELECT babyname,mothername,motherid,dateofbirth,tphm,tpmob,2monthsms FROM file1 ";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("show4n1 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println("age*");

                String nme = rs.getString("dateofbirth");
                System.out.print(nme);
                System.out.println("age ***");

                DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDate today = LocalDate.now();
                LocalDate birthday = LocalDate.parse(nme, formater);
                Period p = Period.between(birthday, today);
                System.out.println(p);

                if (p.getYears() == 0 & p.getMonths() == 2 & p.getDays() < 7) {

                    System.out.println("age reslt");

                    AgeInfo info = new AgeInfo();
                    System.out.println("hari2");
                    System.out.println(rs.toString());
                    String a = rs.getString("babyname");
                    String e = rs.getString("mothername");
                    String f = rs.getString("motherid"); 
                    System.out.println("nama ganna ba");
                    int b = rs.getInt("tphm");
                    int c = rs.getInt("tpmob");
                   String d=rs.getString("2monthsms");
                  //  boolean s = rs.getBoolean("sms");
                    info.setBabyname(a);
                    info.setMothername(e);
                    info.setIdnum(f);
                    info.setTphm("0" + b);
                    info.setTpmob("0" + c);
                    info.setAge(p.getYears() + "years," + p.getMonths() + "months," + p.getDays() + "days");
                    info.setMonth2sms(d);

                    System.out.println("age1 2***");
                    list1.add(info);
                    System.out.println("dan hari 2***");

                }

                System.out.println("show4n1 3");
              //  pst.executeUpdate();//excute the sql quary & insert the values to the db table
                System.out.println("show4n1 4");
            }
            return list1;
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
    
    
     ArrayList<AgeInfo> getDetails2() {

        try {
            ArrayList<AgeInfo> list2 = new ArrayList<AgeInfo>();
            System.out.println("show4n1 1");
            ArrayList<AgeInfo> agList = new ArrayList<AgeInfo>();
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "SELECT babyname,mothername,motherid,dateofbirth,tphm,tpmob,4monthsms FROM file1 ";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("show4n1 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println("age*");

                String nme = rs.getString("dateofbirth");
                System.out.print(nme);
                System.out.println("age ***");

                DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDate today = LocalDate.now();
                LocalDate birthday = LocalDate.parse(nme, formater);
                Period p = Period.between(birthday, today);
                System.out.println(p);

                if (p.getYears() == 0 & p.getMonths() == 4 & p.getDays() < 7) {

                    System.out.println("age reslt");

                    AgeInfo info = new AgeInfo();
                    System.out.println("hari2");
                    System.out.println(rs.toString());
                    String a = rs.getString("babyname");
                    String e = rs.getString("mothername");
                    String f = rs.getString("motherid");
                    System.out.println("nama ganna ba");
                    int b = rs.getInt("tphm");
                    int c = rs.getInt("tpmob");
                   String d=rs.getString("4monthsms");
                  //  boolean s = rs.getBoolean("sms");
                    info.setBabyname(a);
                    info.setMothername(e);
                    info.setIdnum(f);
                    info.setTphm("0" + b);
                    info.setTpmob("0" + c);
                    info.setAge(p.getYears() + "years," + p.getMonths() + "months," + p.getDays() + "days");
                    info.setMonth4sms(d);

                    System.out.println("age1 2***");
                    list2.add(info);
                    System.out.println("dan hari 2***");

                }

                System.out.println("show4n1 3");
              //  pst.executeUpdate();//excute the sql quary & insert the values to the db table
                System.out.println("show4n1 4");
            }
            return list2;
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

    ArrayList<AgeInfo> getDetails3() {

        try {
            ArrayList<AgeInfo> list3 = new ArrayList<AgeInfo>();
            System.out.println("show4n1 1");

            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "SELECT babyname,mothername,motherid,dateofbirth,tphm,tpmob,6monthsms FROM file1 ";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("show4n1 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println("age*");

                String nme = rs.getString("dateofbirth");

                System.out.println("age ***");

                DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDate today = LocalDate.now();
                LocalDate birthday = LocalDate.parse(nme, formater);
                Period p = Period.between(birthday, today);

                if (p.getYears() == 0 & p.getMonths() == 6 & p.getDays() < 7) {

                    System.out.println("age reslt");

                    AgeInfo info = new AgeInfo();
                    System.out.println("hari2");
                    System.out.println(rs.toString());
                   String a = rs.getString("babyname");
                     String e = rs.getString("mothername");
                    String f = rs.getString("motherid");
                    int b = rs.getInt("tphm");
                    int c = rs.getInt("tpmob");
                    String s = rs.getString("6monthsms");
                    info.setBabyname(a);
                    info.setMothername(e);
                    info.setIdnum(f);
                    info.setTphm("0" + b);
                    info.setTpmob("0" + c);
                    info.setAge(p.getYears() + "years," + p.getMonths() + "months," + p.getDays() + "days");
                    info.setMonth6sms(s);

                    System.out.println("age1 2***");
                    list3.add(info);
                    System.out.println("dan hari 2***");

                }

                System.out.println("show4n1 3");
                //pst.executeUpdate();//excute the sql quary & insert the values to the db table
                System.out.println("show4n1 4");
            }
            return list3;
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

    ArrayList<AgeInfo> getDetails4() {

        try {
            ArrayList<AgeInfo> list4 = new ArrayList<AgeInfo>();
            System.out.println("show4n1 1");

            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "SELECT babyname,mothername,motherid,dateofbirth,tphm,tpmob,9monthsms FROM file1 ";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("show4n1 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println("age*");

                String nme = rs.getString("dateofbirth");

                System.out.println("age ***");

                DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDate today = LocalDate.now();
                LocalDate birthday = LocalDate.parse(nme, formater);
                Period p = Period.between(birthday, today);

                if (p.getYears() == 0 & p.getMonths() == 9 & p.getDays() < 7) {

                    System.out.println("age reslt");

                    AgeInfo info = new AgeInfo();
                    System.out.println("hari2");
                    System.out.println(rs.toString());
                    String a = rs.getString("babyname");
                     String e = rs.getString("mothername");
                    String f = rs.getString("motherid");
                    int b = rs.getInt("tphm");
                    int c = rs.getInt("tpmob");
                    String s = rs.getString("9monthsms");
                     info.setBabyname(a);
                    info.setMothername(e);
                    info.setIdnum(f);
                    info.setTphm("0" + b);
                    info.setTpmob("0" + c);
                    info.setAge(p.getYears() + "years," + p.getMonths() + "months," + p.getDays() + "days");
                    info.setMonth9sms(s);

                    System.out.println("age1 2***");
                    list4.add(info);
                    System.out.println("dan hari 2***");

                }

                System.out.println("show4n1 3");
                //pst.executeUpdate();//excute the sql quary & insert the values to the db table
                System.out.println("show4n1 4");
            }
            return list4;
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

    ArrayList<AgeInfo> getDetails5() {

        try {
            ArrayList<AgeInfo> list5 = new ArrayList<AgeInfo>();
            System.out.println("show4n1 1");

            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "SELECT babyname,mothername,motherid,dateofbirth,tphm,tpmob,1yearsms FROM file1 ";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("show4n1 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println("age*");

                String nme = rs.getString("dateofbirth");

                System.out.println("age ***");

                DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDate today = LocalDate.now();
                LocalDate birthday = LocalDate.parse(nme, formater);
                Period p = Period.between(birthday, today);

                if (p.getYears() == 1 & p.getMonths() == 0 & p.getDays() < 7) {

                    System.out.println("age reslt");

                    AgeInfo info = new AgeInfo();
                    System.out.println("hari2");
                    System.out.println(rs.toString());
                    String a = rs.getString("babyname");
                     String e = rs.getString("mothername");
                    String f = rs.getString("motherid");
                    int b = rs.getInt("tphm");
                    int c = rs.getInt("tpmob");
                    String s = rs.getString("1yearsms");
                     info.setBabyname(a);
                    info.setMothername(e);
                    info.setIdnum(f);
                    info.setTphm("0" + b);
                    info.setTpmob("0" + c);
                    info.setAge(p.getYears() + "years," + p.getMonths() + "months," + p.getDays() + "days");
                    info.setYear1sms(s);

                    System.out.println("age1 2***");
                    list5.add(info);
                    System.out.println("dan hari 2***");

                }

                System.out.println("show4n1 3");
                //pst.executeUpdate();//excute the sql quary & insert the values to the db table
                System.out.println("show4n1 4");
            }
            return list5;
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

    ArrayList<AgeInfo> getDetails6() {

        try {
            ArrayList<AgeInfo> list6 = new ArrayList<AgeInfo>();
            System.out.println("show4n1 1");

            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "SELECT babyname,mothername,motherid,dateofbirth,tphm,tpmob,18monthsms FROM file1 ";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("show4n1 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println("age*");

                String nme = rs.getString("dateofbirth");

                System.out.println("age ***");

                DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDate today = LocalDate.now();
                LocalDate birthday = LocalDate.parse(nme, formater);
                Period p = Period.between(birthday, today);

                if (p.getYears() == 1 & p.getMonths() == 6 & p.getDays() < 7) {

                    System.out.println("age reslt");

                    AgeInfo info = new AgeInfo();
                    System.out.println("hari2");
                    System.out.println(rs.toString());
                    String a = rs.getString("babyname");
                     String e = rs.getString("mothername");
                    String f = rs.getString("motherid");
                    int b = rs.getInt("tphm");
                    int c = rs.getInt("tpmob");
                    String s = rs.getString("18monthsms");
                     info.setBabyname(a);
                    info.setMothername(e);
                    info.setIdnum(f);
                    info.setTphm("0" + b);
                    info.setTpmob("0" + c);
                    info.setAge(p.getYears() + "years," + p.getMonths() + "months," + p.getDays() + "days");
                    info.setMonth18sms(s);

                    System.out.println("age1 2***");
                    list6.add(info);
                    System.out.println("dan hari 2***");

                }

                System.out.println("show4n1 3");
                //pst.executeUpdate();//excute the sql quary & insert the values to the db table
                System.out.println("show4n1 4");
            }
            return list6;
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

    ArrayList<AgeInfo> getDetails7() {

        try {
            ArrayList<AgeInfo> list7 = new ArrayList<AgeInfo>();
            System.out.println("show4n1 1");

            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "SELECT babyname,mothername,motherid,dateofbirth,tphm,tpmob,3yearsms FROM file1 ";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("show4n1 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println("age*");

                String nme = rs.getString("dateofbirth");

                System.out.println("age ***");

                DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDate today = LocalDate.now();
                LocalDate birthday = LocalDate.parse(nme, formater);
                Period p = Period.between(birthday, today);

                if (p.getYears() == 3 & p.getMonths() == 0 & p.getDays() < 7) {

                    System.out.println("age reslt");

                    AgeInfo info = new AgeInfo();
                    System.out.println("hari2");
                    System.out.println(rs.toString());
                    String a = rs.getString("babyname");
                     String e = rs.getString("mothername");
                    String f = rs.getString("motherid");
                    int b = rs.getInt("tphm");
                    int c = rs.getInt("tpmob");
                    String s = rs.getString("3yearsms");
                    info.setBabyname(a);
                    info.setMothername(e);
                    info.setIdnum(f);
                    info.setTphm("0" + b);
                    info.setTpmob("0" + c);
                    info.setAge(p.getYears() + "years," + p.getMonths() + "months," + p.getDays() + "days");
                    info.setYear3sms(s);

                    System.out.println("age1 2***");
                    list7.add(info);
                    System.out.println("dan hari 2***");

                }

                System.out.println("show4n1 3");
                // pst.executeUpdate();//excute the sql quary & insert the values to the db table
                System.out.println("show4n1 4");
            }
            return list7;
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

    ArrayList<AgeInfo> getDetails8() {

        try {
            ArrayList<AgeInfo> list8 = new ArrayList<AgeInfo>();
            System.out.println("show4n1 1");

            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "SELECT babyname,mothername,motherid,dateofbirth,tphm,tpmob,5yearsms FROM file1 ";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("show4n1 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println("age*");

                String nme = rs.getString("dateofbirth");

                System.out.println("age ***");

                DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDate today = LocalDate.now();
                LocalDate birthday = LocalDate.parse(nme, formater);
                Period p = Period.between(birthday, today);

                if (p.getYears() == 5 & p.getMonths() == 0 & p.getDays() < 7) {

                    System.out.println("age reslt");

                    AgeInfo info = new AgeInfo();
                    System.out.println("hari2");
                    System.out.println(rs.toString());
                    String a = rs.getString("babyname");
                     String e = rs.getString("mothername");
                    String f = rs.getString("motherid");
                    int b = rs.getInt("tphm");
                    int c = rs.getInt("tpmob");
                    String s = rs.getString("5yearsms");
                     info.setBabyname(a);
                    info.setMothername(e);
                    info.setIdnum(f);
                    info.setTphm("0" + b);
                    info.setTpmob("0" + c);
                    info.setAge(p.getYears() + "years," + p.getMonths() + "months," + p.getDays() + "days");
                    info.setYear5sms(s);

                    System.out.println("age1 2***");
                    list8.add(info);
                    System.out.println("dan hari 2***");

                }

                System.out.println("show4n1 3");
                //pst.executeQuery();//excute the sql quary & insert the values to the db table
                System.out.println("show4n1 4");
            }
            return list8;
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

    ArrayList<AgeInfo> getDetails9() {

        try {
            ArrayList<AgeInfo> list9 = new ArrayList<AgeInfo>();
            System.out.println("show4n1 1");

            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "SELECT babyname,mothername,motherid,dateofbirth,tphm,tpmob,12yearsms FROM file1 ";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("show4n1 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println("age*");

                String nme = rs.getString("dateofbirth");

                System.out.println("age ***");

                DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDate today = LocalDate.now();
                LocalDate birthday = LocalDate.parse(nme, formater);
                Period p = Period.between(birthday, today);

                if (p.getYears() == 12 & p.getMonths() == 0 & p.getDays() < 7) {

                    System.out.println("age reslt");

                    AgeInfo info = new AgeInfo();
                    System.out.println("hari2");
                    System.out.println(rs.toString());
                    String a = rs.getString("babyname");
                     String e = rs.getString("mothername");
                    String f = rs.getString("motherid");
                    int b = rs.getInt("tphm");
                    int c = rs.getInt("tpmob");
                    String s = rs.getString("12yearsms");
                     info.setBabyname(a);
                    info.setMothername(e);
                    info.setIdnum(f);
                    info.setTphm("0" + b);
                    info.setTpmob("0" + c);
                    info.setAge(p.getYears() + "years," + p.getMonths() + "months," + p.getDays() + "days");
                    info.setYear12sms(s);

                    System.out.println("age1 2***");
                    list9.add(info);
                    System.out.println("dan hari 2***");

                }

                System.out.println("show4n1 3");
                //  pst.executeQuery();//excute the sql quary & insert the values to the db table
                System.out.println("show4n1 4");
            }
            return list9;
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
}
