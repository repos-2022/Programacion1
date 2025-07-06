package pkg09.clases.tarea;
import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {
        CNumeros o1;//el objeto
        o1=new CNumeros();
        
        String a=JOptionPane.showInputDialog(null,"Introdusca un numero");
        int A=Integer.parseInt(a);
        o1.setNumero(A);
        A=o1.GetNumero();
        
        String b=JOptionPane.showInputDialog(null,"Introdusca el segundo numero");
        int B=Integer.parseInt(b);
        o1.setNumero(B);
        B=o1.GetNumero();
        
        String c=JOptionPane.showInputDialog(null,"Introdusca el tercero numero");
        int C=Integer.parseInt(c);
        o1.setNumero(C);
        C=o1.GetNumero();
        
        String d=JOptionPane.showInputDialog(null,"Introdusca el cuarto numero");
        int D=Integer.parseInt(d);
        o1.setNumero(D);
        D=o1.GetNumero();
        
        String e=JOptionPane.showInputDialog(null,"Introdusca el quinto numero");
        int E=Integer.parseInt(e);
        o1.setNumero(E);
        E=o1.GetNumero();
        
        JOptionPane.showMessageDialog(null,"Los numeros introducidos son:"+A+", "+B+", "+C+", "+D+", "+E);
    }
}