package pkg10.numeros;
import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args){
        new JFrameCNumero().setVisible(true);
        CNumero o1;
        o1=new CNumero();//
        //leemos el valor
        String Cad=JOptionPane.showInputDialog("Introdusca un valor: ");
        int aux=Integer.parseInt(Cad);
        o1.SetNumero(aux);
        JOptionPane.showMessageDialog(null,"Se guardo le valor");
        //mostramos el valor
        aux=o1.GetNumero();
        JOptionPane.showMessageDialog(null,"El nuemro guardado es:"+aux);
    }
}