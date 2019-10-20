/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;




import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.EventListener;
import static javax.management.Query.value;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Hansi
 */
public class Months2 extends AbstractTableModel {

    private static final String[] COLUMN_NAMES = {"Baby's Name","Mother's ID", "T.P.Home", "T.P.Mobile", "Age","Sms"};
    private static ArrayList<AgeInfo> list1;
    

    Months2(ArrayList<AgeInfo> stList) {
        
        list1 = stList;

    }
   
    


    @Override
    public int getRowCount() {
        return list1.size(); //To change body of generated methods, choose Tools | Templates.
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
                return list1.get(rowIndex).getBabyname();
            case 1:
                return list1.get(rowIndex).getIdnum();
            case 2:
                return list1.get(rowIndex).getTphm();
            case 3:
                return list1.get(rowIndex).getTpmob();
            case 4:
                return list1.get(rowIndex).getAge();
            case 5:
                return list1.get(rowIndex).getMonth2sms();

            default:
                return null;
        }//To change body of generated methods, choose Tools | Templates.
    }

}



   

