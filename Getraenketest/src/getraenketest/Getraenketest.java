package getraenketest;

import javax.swing.JOptionPane;

public class Getraenketest {

    
    public static void main(String[] args) {
      
        int nocheine = JOptionPane.YES_OPTION;    // muss vorher definiert werden ,da sonst später nicht verwendbar/ erkennbar
        int kalorien = 0;
        
       while (nocheine == JOptionPane.YES_OPTION){      // nicht vergessen: == nicht =
        
        String name = JOptionPane.showInputDialog("Bitte Getränkename eingeben: ");
        String menge = JOptionPane.showInputDialog("Bitte Menge eingeben: ");
        String kcal = JOptionPane.showInputDialog("Kalorien je 100 ml: ");
        
         Getranke meineGetraenke = new Getranke(name, Integer.parseInt(menge), Integer.parseInt(kcal) );
        
        nocheine = JOptionPane.showConfirmDialog(null, "Noch was?","", JOptionPane.YES_NO_OPTION);      // null nicht vergessen + 4 Parameter
        
        kalorien+= meineGetraenke.gesamtKalorien();
        System.out.println(meineGetraenke + "Insgesamt schon: " + kalorien + "Kalorien");
        
        
       }
       
      
    }
    
}
