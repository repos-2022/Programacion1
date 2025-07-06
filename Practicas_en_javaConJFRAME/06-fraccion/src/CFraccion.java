/*todo esto se llama implementacion del metodo
*como todos estos llevan public significa que los vamos a poder usar en cualquier archivo
ESEPTO los atributos PRIVATE (NUM, DEN)
*/

public class CFraccion{
    //implementamos o declaramos los atributos de la persona u objeto
    private int num;
    private int den;
    //private osea solo se las conoce en este archivo
    //public para  que se pueda usar en el main
    public CFraccion(){//construtor, este nos va a ayudar a acrear objetos de la clase
        //y lo inicializamos para que se se limpien los atributos 
        num=0;
        den=1;
    }
    //metemos los valores, el parentecis es la entrada {parametro de entrada}
    public void PonerNum(int n){//VOID significa PROCEDIMIENTO
        num=n;
    }
    //significa que no retorna nada porque esta colocando todo lo que entra en la variable num
    //a estos tambien se los representa como a la CAJA NEGRA
    public void PonerDen(int d){
        den=d;
    }
    public int sacarNum(){//sacarNum es el nombre, el objeto para que sepueda usar 
       //esta es una FUNCION osea va a sacar todo lo que este en la variable num
        return num;
    }
    public int sacarDen(){//FUNCION
        return den;
    //vasicamente esto es solo para que retorne la variable 
    //listo para usarse en el main o JFrame :-)
    }
}