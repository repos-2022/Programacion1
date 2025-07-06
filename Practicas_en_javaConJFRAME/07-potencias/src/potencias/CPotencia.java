package potencias;
public class CPotencia {
    //b=base, e=exponente
    private int b;
    private int e;
    //aplicamos el constructor
    public CPotencia(){
    b=0;
    e=1;
    /*por que no cero? porque sea cual sea la base y esta elevado a cero su valor sera de 1
    mientras que si es exponente es 1 y la base es 10 el resultado sera de 10
    */
    }
    public void PonerBase(int x){//ponedores o procedimiento
        b=x;
    }
    public void PonerExpo(int y){
        e=y;
    }
    public int SacarBase(){//sacadores o funcion
        return b;
    }
    public int SacarExpo(){
        return e;
    }
}