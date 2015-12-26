/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapas;

/**
 *
 * @author HP14
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
public class ARRAY_PENGUNJUNG extends AbstractTableModel {
    private List <PENGUNJUNG> LISTPENGUNJUNG = new ArrayList<>();

    public void insert (PENGUNJUNG PENGUNJUNGBARU){
        LISTPENGUNJUNG.add   (PENGUNJUNGBARU);
        fireTableDataChanged();
    }
    
    public void update (int index, PENGUNJUNG PENGUNJUNGUPDATE){
        LISTPENGUNJUNG.set(index, PENGUNJUNGUPDATE);
        fireTableDataChanged();
    }
    
    public void delete(int index){
        LISTPENGUNJUNG.remove(index);
        fireTableDataChanged();
    }
    
    public PENGUNJUNG getData_pengunjung(int index){
        return LISTPENGUNJUNG.get(index);        
    }
    
    public void setLISTPENGUNJUNG(List<PENGUNJUNG> listPENGUNJUNGBARU){
        LISTPENGUNJUNG = listPENGUNJUNGBARU;
        fireTableDataChanged();
    }   

    @Override
    public int getRowCount() {
        return LISTPENGUNJUNG.size();
    }
         
    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return rowIndex + 1;
            case 1:
                return LISTPENGUNJUNG.get(rowIndex).getNIK();
            case 2:
                return LISTPENGUNJUNG.get(rowIndex).getNAMA();
            case 3:
                return LISTPENGUNJUNG.get(rowIndex).getHUBUNGAN();
            case 4:
                return LISTPENGUNJUNG.get(rowIndex).getNO_HP();
            case 5:
                return LISTPENGUNJUNG.get(rowIndex).getALAMAT();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "NO";
            case 1:
                return "NIK";
            case 2:
                return "NAMA";
            case 3:
                return "HUBUNGAN";
            case 4:
                return "NO HP";
             case 5:
                 return "ALAMAT";
                
            default:
                return null;
        }
    }    
}
