import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {
    //importamos el objeto
    //este o1 es nuestro objeto 1
    CFraccion o1;
    o1=new CFraccion();
    //el joptionpane siempre resive datos de tipo STRING, siempre!
    String aux=JOptionPane.showInputDialog("Introdusca numerador: ");
    int x=Integer.parseInt(aux);
    //usamos el objeto
    o1.PonerNum(x);
    
    String aux2=JOptionPane.showInputDialog("Introdusca denominador: ");
    int y=Integer.parseInt(aux2);
    //usamos al objeto
    o1.PonerDen(y);
    
    //usamos al METODO QUE ME PRMITE SACAR asia a afuera 
    int X=o1.sacarNum();
    int Y=o1.sacarDen();
    JOptionPane.showMessageDialog(null,"La fraccion es:"+X+"/"+Y);
    }
}