package potencias;
import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {
        //importamos el objeto
        CPotencia o1;
        o1=new CPotencia();
        //introducir datos(para la base)
        String aux=JOptionPane.showInputDialog("Introdusca valor para la base ");
        //convertirlo a entero b
        int a=Integer.parseInt(aux);
        o1.PonerBase(a);
        
        //introducir datos(para el exponente)
        String aux2=JOptionPane.showInputDialog("Introdusca valor para la cosiente ");
        //convertirlo a entero t
        int t=Integer.parseInt(aux2);
        o1.PonerExpo(t);
        
        //SACAMOS EL OBJETO
        int x=o1.SacarBase();
        int y=o1.SacarExpo();
        JOptionPane.showMessageDialog(null, "La potencia :"+x+"^"+y);
    }
}