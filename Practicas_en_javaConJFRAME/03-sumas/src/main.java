import javax.swing.JOptionPane;
public class main{
    public static void main(String[] args){
        int a=Integer.parseInt(JOptionPane.showInputDialog("introdusca un valor:"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("introdusca un valor:")); 
        int S=a+b;
        JOptionPane.showMessageDialog(null, "la summa es:"+S);
    }
}