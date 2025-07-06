//public para que se pueda usar en el MAIN
//Como funciona la clase?
//1)declaramos atributos, 2)iniciamos el atributo(asignar valor)
//3)hacer que entren valores y asignar al atributo, 4)retornamos el atributo;-)
/*
#en PASCAL DISTINTO se lo hacia con <> en JAVA se lo hace con !=
#COMO USAR EL DISTINT Y EL IGUAL  != y el ==?
#num1=10, num2=10; usandolo en un IF
#if(num1==num2)esto nos dara verdadero, ya que num1 y num2 tienen el mismo valor
#if(num1 != num2)esto nos dara falso, porque ambos valores son iguales 
*/
package pkg10.numeros;
import javax.swing.JOptionPane;
public class CNumero {
    //declaramos los atributos
    private int n;   
    //entoces implementamos el constructor 
    //el constructor vasicamente es la inicializacion
    //n es el constructor(variable global)  
    public CNumero(){              
        n=0;                         
    }
    //con esto metemos los valores
    //lo que entre lo asignamos a la variable n
    public void SetNumero(int v){//PROCEDIMIENTO
        n= v;
    }
    public int GetNumero(){//FUNCION
        return n;
        //con esto sacamos el valor
        //ahora lo utilizamos en el main
    }
    //#3 cantidad de digitos
    public int CantDigitos(){
        int aux=n, c=0;
        while(aux!=0){
            aux=aux/10;
            c=c+1;
        }    
        return c;
    }
    /*
    *456/10 la div dara 45 y su residuo es el 6
    en esta division de residuo se caracteriza porque vamos de atras para adelante 
    osea RESIDUOS siguientes(6, 5, 4)se dividira para obtener el dividendo y esto se lo 
    pasara por el CONDICION if donde se los comparara
    */
    //el orden es necesario y es asi, residuo y luego la divicion
    //el residuo para poder jugar con el numero y la division para poder roseguir
    //#4 cantidad de digitos impares
    public int CantDigitoINpar(){
        int aux=n , ci=0, res=0;
        while(aux!=0){
            res=aux%10;
            if(res%2!=0){
                ci=ci+1;
            }
            aux=aux/10;
        }
         return ci;
    }
    //#5 cantidad de digitos pares
    public int CantDigitoPar(){
        int aux=n, cp=0, res=0;
        while(aux!=0){
            res=aux%10;
            if(res %2==0){
                cp=cp+1;
            }
            aux=aux/10;
        }         
        return cp;
    }
    //#6 sumar digitos pares
    public int SumarDigitoPar(){
        int aux=n, sp=0, res=0;
        while(aux !=0){
            res=aux%10;
            if(res %2==0){
                sp=sp+res;
            }
            aux=aux/10;
        }
         return sp;
    }
    //#7 sumar digitos impares
    public int SumarDigitoINpar(){
        int aux=n, si=0, res;
        while(aux!=0){
            res=aux%10;
            if(res %2!=0){
                si=si+res;
            }
            aux=aux/10;
        }
         return si;
    }
    //#8 suma de digitos
    public int SumaDigitos(){
        int aux=n, res=0, s=0;
        while(aux != 0){
            res=aux%10;
            s=s+res;
            aux=aux/10;
        }
        return s;
    }
    //implementar un metodo que permita retornar el ultimo digito del numero
    //#9 retornar el ultimo digito del numero
    public int UltimoDigito(){
        int aux=n, res=0;
        res=aux%10;
        return res;
    }
    //#10 retornar el primer numero
    public int PrimerDigito(){
        int aux=n, res=0;
        while(aux !=0){
            res=aux%10;
            aux=aux/10;
        }
        return res;
    }
    //#11 sumar primer digito con el ultimo digito
    //con el termino THIS llamamos a una clase que lla tengamos echa 
    public void sumaPDconUD(){
        n=this.PrimerDigito()+this.UltimoDigito();
    }
    //#12 cambiar al numero n por la concatenacion(JUNTAR) del pd con ud 
    public void CambiarPorConcatenacionPDconUD(){
        n=this.PrimerDigito()*10+this.UltimoDigito();
    }
    //#13 primer digito(segunda forma)
    public void cambiarNPorPD(){
        n=this.PrimerDigito();
    }
    //#14 invertir
    public void Invertir(){
        int aux=n, res=0, m=0;
        while(aux!=0){
            res=aux%10;
            m=m*10+res;
            aux=aux/10;
        }
        n= m;
    }
    //#15 incertar digito en una pocision  
   public int insertarEnPosicion(int valor,int posicion){
        this.Invertir();
        int aux=n,res=0,i=0,NewNum=0;
        while(i<posicion){
            res=aux%10;
            NewNum=NewNum*10+res;
            aux=aux/10;
            i=i+1;
        }
        NewNum=(NewNum*10)+valor;
        while(aux!=0){
            res=aux%10;
            NewNum=NewNum*10+res;
            aux=aux/10;
        }
        return NewNum;
    }
    //#16 eliminar digito de una pocision
    public int eliminarEnPosicion(int posi){
        this.Invertir();
        int aux=n,res=0,c=0,t=0;
        while(c<posi){
            res=aux%10;
            t=(t*10)+res;
            aux=aux/10;
            c=c+1;
        }
        aux=aux/10;
        while(aux!=0){
            res=aux%10;
            aux=aux/10;
        }
        return t;
    }
    //17 verificar si es capicua 
    public void capicua(){
        int aux=n;//numero original
        this.Invertir();//numero invertido
        if(aux==n){//verificamos si son iguales
            JOptionPane.showMessageDialog(null,"Es capicua");
        }else{
            JOptionPane.showMessageDialog(null,"no es capicua");
        }
        n=aux;
    }
}