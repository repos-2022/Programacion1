import javax.swing.JOptionPane;
import javax.swing.JTable;
/*
*MADE BY JUAN ERNESTO CORDERO POZO
*/
public class CVector {
    /*vector=arreglo=array==esto se usa para almacenar elementos de un mismo tipo
    *Ahora para poder implementar un vector, es de la sgte manera(es como crear una variable)
    * private int v[]=, creamos una variable de tipo entero y ponemos [] para identificar que es arreglo
    ***
    * =new int[12]; y le pasamos por su propio constructor indicandole que tiene 12 casillas
    */
    private int v[]=new int[12];
    //dim nos va a identificar cuantos elementos validos tenemos (recordemos que son 12=v)
    private int dim;
    public CVector(){
        dim=-1;//-1 porque 0,1,2,3,etc... es parte de vector y -1 no forma parte del vector
               //y con poner -1 todo el vector se inicializa en 0
    }
    public void setDim(int CantElem){//poner (procedimiento)
        dim=CantElem -1;
    }
    public void setvalor(int posi, int valor){
        v[posi]=valor;
    }
    public int GetDim(){//sacar (funcion)
        return dim;
    }
    public int getvalor(int posi){
        return v[posi];
    }
    //#2 CARGAR VECTOR
    public void cargarVector(){
        for(int i=0; i<=dim; i+=1){
            //todos los digitos que introdusca el usuario entraran por la variable cad
            String cad=JOptionPane.showInputDialog("Valor para la posicion:"+i);
            int valor=Integer.parseInt(cad);
            v[i]=valor;//y aqui lo asignamos al vector en la posicion i
        }
    }
    //#3 MOSTRAR VECTOR
    public void mostrarVector(JTable JTVector){
        for(int i=0; i<=dim; i++){
            int valor =v[i];
            JTVector.setValueAt(v[i],i,0);//lo que hace esta fila es, llamar a la tabla(JTVector)
            //setValueAt(v[i]) colocar lo que tiene el vector de la posicion i 
            //(v[i],i,0)este cero es la columna (la columna siempre es fija)
        }
    }
    //#4 CANTIDAD DE ELEMENTOS 
    public int cantidad(){
        return dim+1;
    }
    //#5 SUMAR PARES
    public int SumarPares(){
        int s=0;
        for(int i=0;i<=dim;i++){
            if(v[i]%2==0){
                s=s+v[i];
            }
        }
        return s;
    }
    //#6 SUMAR INPARES
    public int SumarInpares(){
        int si=0;
        for(int i=0;i<=dim;i++){
            if(v[i]%2!=0){
                si=si+v[i];
            }
        }
        return si;
    }
    //#7 CONTAR MULTIPLOS DE TRES
    public int multiploDeTres(){
        int m=0;
        for(int i=0;i<=dim;i++){
            if(v[i]%3==0){
                m=m+1;
            }
        }
        return m;
    }
    //#8 CAMBIAR ELEMENTOS
    //basicamente lo que hace este codigo es copiar y pegar
    public void cambiarElementos(int posA,int posB){
        int aux;
        aux=v[posA];
        v[posA]=v[posB];
        v[posB]=aux;
    }
    //#9 CAMBIAR LOS ELEMENTOS POR LA SUMA PAR 
    public void cambiarPorSumaPar(){
        int x=this.SumarPares();
        for(int i=0;i<=dim;i++){
            v[i]=x;
        }
    }
    //#10 BUSCAR ELEMENTOS EN EL VECTOR(secuensial)--FORMA 1
    public int BusquedaSecuencial(int elem){
        int i=0;
        while((i<=dim)&&(elem!=v[i])){
            i++;
        }
        if(i<=dim){
            return 1;
        }else{
            return 0;
        }
    }
    //#11 BUSCAR ELEMENTOS (BINARIA)--FORMA 2
    //DATO IMPORTANTE!.-este metodo solo funsiona si el vector esta ordenado
    //este metodo es mas  eficiente que el de busqueda secuensial
    public int BusqBinaria(int ele){
        int ini=0,fin=dim,m;
        while(ini<=fin){
            m=(ini+fin)/2;
            if(ele==v[m]){
                return 1;
            }else{
                if(ele<v[m]){
                    fin=m-1;
                }else{
                    ini=m+1;
                }
            }
        }
        if(ini>fin){
            return 0;
        }else{
            return 1;
        }
    }
    //#12 ORDENAMIENTO POR INTERCAMBIO (FORMA_1)
    public void Ord_intercambio(){
        int aux;
        for(int p=0;p<=(this.GetDim()-1);p++){
            for(int p1=p+1;p1<=(this.GetDim());p1++){
                if(v[p1] < v[p]){//(asendente <) (desendente >)
                    aux=v[p1];
                    v[p1]=v[p];
                    v[p]=aux;
                }
            }
        }
    }
    //#13 ORDENAMIENTO POR INTERCAMBIO DESENDIENTE (FORMA_2)
    public void Ord_intercambio_des(){
        int aux;
        for(int p=0;p<=(this.GetDim()-1);p++){
            for(int p1=p+1;p1<=(this.GetDim());p1++){
                if(v[p1] > v[p]){//(asendente <) (desendente >)
                    aux=v[p1];
                    v[p1]=v[p];
                    v[p]=aux;
                }
            }
        }
    }
    //#14 ORDENAMIENTO BURBUJA (FORMA_3)
    public void Ord_Burbuja(){
        int aux;
        for(int j=dim; j>=1; j--){
            for(int i=0;i<=j-1;i++){
                if(v[i] > v[i+1]){//(asendente >) (desendente <)
                    aux=v[i];
                    v[i]=v[i+1];
                    v[i+1]=aux;
                }
            }
        }
    }
    //#15 ORDENAMIENTO POR SELECCION (FORMA_4)
    public void Ord_Seleccion(){
        int aux, k;
        for (int i=0; i<=(this.GetDim()-1);i++){
            k=i;
            for (int j=k+1;j<=this.GetDim();j++){
                if (v[j]<v[k]){
                    k=j;
                }
            }
            if (k != i){
                aux = v[i];
                v[i]=v[k];
                v[k]=aux;
            }
        }
    }
    //#16 CORTE DE CONTROL
    //DATO.- este codigo solo funcina si el VECTOR esta ordenado 
    //y sirve para ver si hay valores repetidos 
    public void CorteControl(){
        this.Ord_Burbuja();
        int i=0, Aux, c;
        while(i<=dim){
            Aux=v[i];
            c=0;
            while((i<=dim)&&(Aux==v[i])){
                c++;
                i++;
            }
            JOptionPane.showMessageDialog(null,"El elemento "+Aux+" se repite "+c+" veces.");
        }
    }
    //#17 PURGA 
    //ESTE SIRVE PARA ELIMINAR LO QUE SE TENGA REPETIDO
    public void Purga(){
        int i=0, j=-1, n=dim, A;
        while(i <= n){
            A = v[i];
            while ((i <= n)&&(A == v[i])){
                i++;
            }
            j++;
            v[j] = A;
        }
        dim=j;
    }
    //#18 moda
    //este algoritmo sirve para saber cual es el elemento que se esta repitiendo
    public int Moda(){
        int i=0, j, Aux, c, CMayor, ElemModa;
        CMayor=-9999;
        ElemModa=-9999;
        while (i<=dim){
            Aux=v[i];
            c=0;
            while ((i<=dim)&&(Aux==v[i])){
                c++;
                i++;
            }
            if (c > CMayor){
                CMayor=c;
                ElemModa=Aux;
            }
        }
        return ElemModa;
    }
    //#19 CANTIDAD DE MODA 
    //DATO.- solo sirve si el vector esta ordenado
    //método que retorna la Cantidad de veces que se repite el un elemento 
    public int Cant_Moda(){
        int Aux, i=0, c, Mayor, ModaAux;
        ModaAux=0;
        Mayor= -9999;
        while (i<=dim){
            Aux=v[i];
            c=0;
            while ((i<=dim)&&(Aux==v[i])){
                i++;
                c++;
            }
            if (c>Mayor){
                Mayor=c;
                ModaAux=Aux;
            }
        }
        return Mayor;
    }
    /*--------------------------EXAMEN (FILA 2)-------------------------------*/
    //#20 Examen(pregunta 1)
    public void SumarMedio(){
        int s=0, x=0;
        for(int i=1;i<=dim-1;i++){
            s=s+v[i];
        }
        for(int j=0;j<=dim;j++){
            v[j]=s;
        }
    }
    //#21 Examen (pregunta 2)
    public void Ord_MItadArriba(){
        int aux, f1=dim/2, a=0;
        a=f1;    
        for (int i=a; i<=(this.GetDim()-1); i++){
            for (int j=i+1; j<=(this.GetDim()); j++){
                if(v[j]<v[i]){
                    aux=v[j];
                    v[j]=v[i];
                    v[i]=aux;
                }
            }
        }
    }
}