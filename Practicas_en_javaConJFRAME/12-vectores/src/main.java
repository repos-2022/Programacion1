/*--------------------------PREGUNTAS DE EXAMENES-------------------------------
    1.-Hacer un programa que sume los multiplos de 2, 5, 10 al mismo tiempo
    2.-Elimina el valor de cualquier posicion
    3.-Dado un valor, reemplazar elementos de cualquier posicion
    4.-reemplazar los elementos Pares
    5.-Sacar una media sumando todos los elementos del vector y poner en todas las celdas el valor de la media
    6.-Eliminar elementos negativos del vector(EXAMEN)
    7.-Eliminar numeros impares del vector
    8.-si el primer elemento es negativo entonces sumar todos los elementos del vector, si el primer elementos es positivo entonces contar todos los elementos del vector
    9.-contar todos los elementos del vector que sean multiplos de 2 y 5 al mismo tiempo
    10.- crear la siguiente secuencia 1,2,3,4,5,6,7,8,9,10,11,12 y transformarlo a  1,2,3,4,5,6,12,11,10,9,8,7.
    11.-CORTE DE CONTROL MULTIPLO DE 2(EXAMEN)
*/
public class main {
    public static void main(String[] args) {
        CVector cv=new CVector();
    /*
    //#1 Hacer un programa que sume los multiplos de 2, 5, 10 al mismo tiempo
    public int SumaM_2_5_10(){
        int m=0;
        for(int i=0; i<=dim;i++){
            if((v[i]%2==0)&&(v[i]%5==0)&&(v[i]%10==0)){
                m=m+v[i];
            }
        }
        return m;
    }
    JOptionPane.showMessageDialog(rootPane,"La suma de los multiplos de 2, 5 y 10 al mismo tiempo es:"+cv.SumaM_2_5_10());
    -------
    //#2 Elimina el valor de cualquier posicion
    public void EliminarUnElemento(int posi){
        int i=posi-1;
        while(i<=dim){
            v[i]=v[i+1];
            i++;
        }
    }
    String a=JOptionPane.showInputDialog(rootPane,"Que elemento desea eliminar?");
    int b=Integer.parseInt(a);
    cv.EliminarUnElemento(b);
    -------
    //#3 Dado un valor, reemplazar elementos de cualquier posicion
    public void reemplazarNumero(int posi, int valor){
        int i=0,k=0,aux;
        while(i<=posi-1){
            k++;
            i++;
        }
        v[k]=valor;
    }    
    String a=JOptionPane.showInputDialog(rootPane,"Que elemento desea reemplazar");
    int A=Integer.parseInt(a);
    String b=JOptionPane.showInputDialog(rootPane,"Introdusca el valor");
    int B=Integer.parseInt(b);
    cv.reemplazarNumero(A, B);
    cv.mostrarVector(AcTableAUTO);
    -------
    //#4 reemplazar los elementos Pares
    public void ReemplazarPares(){
        for(int i=0;i<=dim;i++){
            if(v[i]%2==0){
                String a=JOptionPane.showInputDialog("Reemplaza los digitos pares");
                int A=Integer.parseInt(a);
                v[i]=A;
            }
        }
    }
    cv.ReemplazarPares();
    cv.mostrarVector(AcTableAUTO);
    -------
    //#5 Sacar una media sumando todos los elementos del vector y poner en todas las celdas el valor de la media
    public void SacarMedia(){
        int s=0,i=0,k=0;
        while(i<=dim){
            v[i]=(v[k]/2);
            k++;
            i++;
        }
    }
    cv.SacarMedia();
    cv.mostrarVector(AcTableAUTO);
    -------
    //#6.1 eliminar negativos (EXAMEN)
    public void PURGA_NEGATIVA(){
        this.Ord_Seleccion();
        int i=0, j=0;
        while(i <=dim){
            if(v[i]>=0){
                j++;
            }
            i++;
        }
        int[] newV=new int[j];
        for (int k = 0; k < j; k++) {
            newV[k]=v[j+k];
        }
        this.setDim(j);
        v=newV;
    }
    //#6.2 Eliminar elementos negativos del vector (CODIGO DEL tg)
    public void EliminarNegativos(){
        for (int k = 0; k < dim; k++) {
            //practicamente lo que hace este codigo es verificar a que sea menor que cero e ir recorriendo las casillas 
            if(v[k]<=0){         
                for (int j = k; j < dim+1; j++) {
                    v[j]=v[j+1];
                }
            }
        }
    }
    cv.EliminarNegativos();
    cv.mostrarVector(AcTableAUTO);
    -------
    //#7 Eliminar numeros impares del vector
    public void EliminarInpares(){
        for(int i=0;i<=dim;i++){
            if(v[i]%2!=0){
                for(int j=i;j<=dim+1;j++){
                    v[j]=v[j+1];
                }
            }
        }
    }
    cv.EliminarInpares();
    cv.mostrarVector(AcTableAUTO);
    -------
    //#8 si el primer elemento es negativo entonces sumar todos los elementos del vector, si el primer elementos es positivo entonces contar todos los elementos del vector
    public int SumarVectorOcontarElemento(){
        if(v[0]<=0){
            int s=0;
            for(int i=0;i<=dim;i++){
                s=s+v[i];
            }
            JOptionPane.showMessageDialog(null,"la suma de todo el vector es:"+s);
            return s;
        }else{
            int m=0;
            for(int i=0;i<=dim;i++){
                m=m+1;
            }
            JOptionPane.showMessageDialog(null,"La cantidad de elemento del vector es:"+m);
            return m;
        }
    }
    cv.SumarVectorOcontarElemento();
    -------
    //#9 contar todos los elementos del vector que sean multiplos de 2 y 5 al mismo tiempo 
    public int contarM_2_5(){
        int M=0;
        for(int i=0;i<=dim;i++){
            if((v[i]%2==0)&&(v[i]%5==0)){
                M=M+1;
            }
        }
        return M;
    }
    JOptionPane.showMessageDialog(rootPane,"La cantidad de digitos multiplos de 2 y 5 al mismo tiempo es:"+cv.contarM_2_5());
    -------
    //#10 crear esta cararteristica 1,2,3,4,5,6,7,8,9,10,11,12 = 1,2,3,4,5,6,12,11,10,9,8,7.
    public void Ord_InterAs_BurbDesc(){
        int aux, fin1=dim/2, ini2=fin1+1;
        //ord intercambio ascendente
        for (int i=0; i<=fin1-1; i++){
            for (int j=i+1; j<=fin1; j++){
                if(v[j]<v[i]){
                    aux=v[j];
                    v[j]=v[i];
                    v[i]=aux;
                }
            }
        }
        //ord burbuja descendente
        for (int z=dim; z>=ini2+1; z--){
            for (int x=ini2; x<=z-1; x++){
                if(v[x]<v[x+1]){
                    aux=v[x];
                    v[x]=v[x+1];
                    v[x+1]=aux;
                }
            }
        }
    }
    cv.Ord_InterAs_BurbDesc();
    cv.mostrarVector(AcTableAUTO);
    OptionPane.showMessageDialog(null,"Ya se ordenó de manera correcta");
    -------
    //#11 CORTE DE CONTROL MULTIPLO DE 2(EXAMEN)
    public void CorteControlMultiplo2(){
        this.Ord_Burbuja();
        int i=0, aux, c;
        while(i<=dim){
            c=1;
            aux=v[i];
            while((aux%2==0)&&(aux==v[i])){
                JOptionPane.showMessageDialog(null,"El numero "+v[i]+" es multiplo y se repite "+c);
                i++;
                c++;
            }
        }
    }
    cv.CorteControlMultiplo2();
    cv.mostrarVector(AcTableAUTO);
    -------
    */
    
    
        /*
        EXAMEN FILA 1
        1)REEMPLAZAR A LOS EMENTOS DEL VECTOR POR LA SUMA DE SUS ELEMENTOS EXTERNOS(7,6,-3,-2,4,0,5)        RESPUESTA(12,12,12,12,12,12,12)
        2)MEDIANTE EL METODO DE ORD_INTERCAMBIO ORDENAR EL VECTOR PERO SOLO A LOS ELEMENTOS DEL MEDIO(2,6,5,4,-3,2,5,10)RESPUESTA(2,-3,2,4,5,6,10)
        
        EXAMEN FILA 2
        1)REEMPLAZAR A TODOS LOS ELEMENTOS DEL VECTOR POR LA SUMA DE SUS ELEMENTOS MEDIOS (3,2,1,-3,-2,5,6) RESPUESTA (3,3,3,3,3,3,3)
        2)MEDIANTE EL ORD_INTERCAMBO DIVIDIR AL VECTOR Y ORDENAR SOLO LA MITAD (4,-2,6,-1,3,10,2,5)         RESPUESTA(4,-2,6,-1,2,3,5,10)
        */
    }
}