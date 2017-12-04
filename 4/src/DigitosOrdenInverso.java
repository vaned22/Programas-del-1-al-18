
/**
 *
 *
 */
       import javax.swing.JOptionPane;
public class  DigitosOrdenInverso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,i=0,digitos=0;
        String invertido="";
        try {

            num=Integer.parseInt(JOptionPane.showInputDialog("Inserte el número:"));
            digitos=num;

            while (digitos>=1){
                invertido=invertido+digitos%10;
                digitos=digitos/10;
            }
            JOptionPane.showMessageDialog(null, "El número  es: "+invertido);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null," incorrecto");
        }
    }
}
