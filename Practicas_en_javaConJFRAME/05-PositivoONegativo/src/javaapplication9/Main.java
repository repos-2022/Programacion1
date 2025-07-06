package javaapplication9;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String x= JOptionPane.showInputDialog("Introdusca un valor");
        int y=Integer.parseInt(x);
        if(y>0){
            JOptionPane.showMessageDialog(null,"El numero "+y+" es positivo");
        }else{
            JOptionPane.showMessageDialog(null,"El numero "+y+" es negativo");
        } 
    }
}