package pkg02.variablesstringsaludo;
import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {
        String a="";
        a=JOptionPane.showInputDialog("Introduzca nombre");
        
        String b=JOptionPane.showInputDialog("Introduzca apellideo");
        System.out.println("Hola, "+a+" "+b+", ¿como estas?");
        JOptionPane.showMessageDialog(null, "Hola, "+a+" "+b+", ¿como estas?");
    }
}