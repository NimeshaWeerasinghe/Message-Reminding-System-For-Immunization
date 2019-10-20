/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hansi
 */
public class Months4 extends AbstractTableModel{
    
    private static final String[] COLUMN_NAMES = {"Baby's Name","Mother's ID", "T.P.Home", "T.P.Mobile", "Age","Sms"};
    private static ArrayList<AgeInfo> list2;
    

    Months4(ArrayList<AgeInfo> stList) {
        
        list2 = stList;

    }
   
    


    @Override
    public int getRowCount() {
        return list2.size(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getColumnName(int columnIndex) {
        return COLUMN_NAMES[columnIndex];
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length; //To change body of generated methods, choose Tools | Templates.
    }
    


  
              



    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {

            case 0:
                return list2.get(rowIndex).getBabyname();
            case 1:
                return list2.get(rowIndex).getIdnum();
            case 2:
                return list2.get(rowIndex).getTphm();
            case 3:
                return list2.get(rowIndex).getTpmob();
            case 4:
                return list2.get(rowIndex).getAge();
            case 5:
                return list2.get(rowIndex).getMonth4sms();

            default:
                return null;
        }//To change body of generated methods, choose Tools | Templates.
    }

}
