import javax.swing.JOptionPane;
import javax.swing.JTable;
/*
*MADE BY JUAN ERNESTO CORDERO POZO
*/
public class CMATRIZ{
    //Este es un arreglo(array) pero este es de dos dimenciones en el que posee filas y columnas 
    private int M[][]=new int[10][10];
    private int nfil,ncol;//Con estas dos variables vamos a identificar cuantas filas y columnas vamos a ocupar
    public CMATRIZ(){
        //Ahora lo inicilizamos en -1 para que no tenga ningun elemento y se inicialize todo en 0 
        nfil=-1;
        ncol=-1;
    }
    public void SetElem(int val, int i, int j){
        M[i][j]=val;
    }
    public int GetElem(int i, int j){
        return (M[i][j]);
    }
    //para definir numeros de filas a la matris
    public void SetNfil(int nf){//procedimiento
        nfil=nf-1;
    }
    //para definir numeros de columnas a la matris
    public void SetNcol(int nc){
        ncol=nc-1;
    }
    //para obtener numero de filas
    public int GetNfil(){//funcion
        return nfil;
    }
    public int GetNcol(){
        return ncol;
    }
    //#1 COLOCAR DIMENCION DE LA MATRIZ
    public void colocarDimencion(int a,int v){
        this.SetNfil(a);
        this.SetNcol(v);
    } 
    //#2 CARGAR MATRIZ
    public void CargarMatriz(){
        for(int i=0;i<=(nfil);i++){
            for(int j=0;j<=(ncol);j++){
                String cad=JOptionPane.showInputDialog(null,"M["+(i+1)+","+(j+1)+"]");
                int x=Integer.parseInt(cad);
                M[i][j]=x;
            }
        }
    }
    //#3 MOSTRAR MATRIZ
    public void MostrarMatriz(JTable JTABLEmatriz){
        for(int i=0;i<=(nfil);i++){
            for(int j=0;j<=(ncol);j++){
                int x=M[i][j];
                JTABLEmatriz.setValueAt(x,i,j);
            }
        }
    }
    //#4 cantidad de elementos de la matriz
    public int CantElemMatriz(){
        return((nfil+1)*(ncol+1));
    }
    //#5 sumar todos los elementos de la matriz
    public int SumaElementos(){
        int ac=0;
        for(int i=0; i<=nfil;i++){
            for (int j=0; j<=ncol;j++){
                ac=ac+M[i][j];
            }
        }
        return ac;
    }
    //#6 sumar de elementos pares
    public int SumaPares(){
        int SP=0;
        for(int i=0; i<=nfil;i++){
            for (int j=0; j<=ncol;j++){
                if(M[i][j]%2==0){   
                    SP=SP+M[i][j];
                }
            }
        }
        return SP;
    }
    //#7 SUMA DE ELEMENTOS NEGATIVOS 
    public int SumaNegativos(){
        int SN=0;
        for(int i=0; i<=nfil;i++){
            for (int j=0; j<=ncol;j++){
                if(M[i][j]<0){   
                    SN=SN+M[i][j];
                }
            }
        }
        return SN;
    }
    //#8 SUMAR EL PRIMER Y ULTIMO ELEMENTO DE MATRIZ
    public int SumaPrimeroCONultimo(){
        int AC=M[0][0] + M[nfil][ncol];
        return AC;
    }
    //#9 SUMAR Y CONTAR LOS ELEMENTOS MULTIPLOS DE TRES
    public int SumarMUL3PARTE1(){
        int m=0;
        for(int i=0; i<=nfil;i++){
            for (int j=0; j<=ncol;j++){
                if(M[i][j]%3==0){   
                    m=m+M[i][j];
                }
            }
        }
        return m;
    }
    public int ContarMultiplo3PARTE2(){
        int c=0;
        for(int i=0; i<=nfil;i++){
            for (int j=0; j<=ncol;j++){
                if(M[i][j]%3==0){   
                    c=c+1;
                }
            }
        }
        return c;
    }
    //#10 SUMAR TODOS LOS ELEMENTOS DE LA DIGONAL PRINCIPAL
    public int SumaDiagonalPrincipal(){
        int ac=0;
        for (int i=0;i<=ncol;i++){
            ac=ac+M[i][i];
        }
        return ac;
    }
    //#11 SUMAR TODOS LOS ELEMENTOS DE LA DIGONAL SECUNDARIA
    public int SumaDiagonalSecundaria(){
        int ac=0;
        for (int i=0;i<=ncol;i++){
            ac=ac+M[i][ncol-i];
        }
        return ac;
    }
    //#12 SUMA DE LOS ELEMENTOS DE LA TRIANGULAR INFERIOR IZQUIERDA (sin la diagonal principal)
    public int SumaTIIsinLaPrincipal(){
        int ac=0;
        for(int i=0; i<=nfil;i++){
            for (int j=0; j<=i-1;j++){
                ac=ac+M[i][j];
            }
        }
        return ac;
    }
    //#13 SUMA DE LOS ELEMENTOS DE LA TRIANGULAR INFERIOR IZQUIERDA (con la diagonal principal)
    public int SumaTIIConLaPrincipal(){
        int ac=0;
        for(int i=0; i<=nfil;i++){
            for (int j=0; j<=i;j++){
                ac=ac+M[i][j];
            }
        }
        return ac;
    }
    //#14 SUMA DE LOS ELEMENTOS DE LA TRIANGULAR SUPERIOR DERECHA (sin la diagonal principal)
    public int SumaTSDsinLaPrincipal(){
        int ac=0;
        for(int i=0; i<=nfil-1;i++){
            for (int j=i+1; j<=ncol;j++){
                ac=ac+M[i][j];
            }
        }
        return ac;
    }
    //#15 SUMA DE LOS ELEMENTOS DE LA TRIANGULAR SUPERIOR DERECHA (con la diagonal principal)
    public int SumaTSDconLaPrincipal(){
        int ac=0;
        for(int i=0; i<=nfil;i++){
            for (int j=i; j<=ncol;j++){
                ac=ac+M[i][j];
            }
        }
        return ac;
    }
    //#16 SUMA DE LOS ELEMENTOS DE LA TRIANGULAR SUPERIOR IZQUIERDA(con la diagonal secundaria)(opuesta)
    public int SumaTSIconLaSecundaria(){
        int ac=0;
        for(int i=0; i<=nfil;i++){
            for (int j=0; j<=(nfil-i);j++){
                ac=ac+M[i][j];
            }
        }
        return ac;
    }
    //#17 SUMA DE LOS ELEMENTOS DE LA TRIANGULAR SUPERIOR IZQUIERDA(sin la diagonal secundaria)(opuesta)(TAREA)
    public int SumaTSIsinLaSecundaria(){
        int ac=0;
        for(int i=0; i<=nfil-1;i++){
            for (int j=0; j<=((nfil-1)-i);j++){
                ac=ac+M[i][j];
            }
        }
        return ac;
    }
    //#18 SUMA DE LOS ELEMENTOS DE LA TRIANGULAR INFERIOR DERECHA(con la diagonal secundaria)(opuesta)(TAREA)
    public int SumaTIDconLaSecundaria(){
        int ac=0;
        for(int i=0; i<=nfil;i++){
            for (int j=(nfil-i); j<=nfil;j++){
                ac=ac+M[i][j];
            }
        }
        return ac;
    }
    //#19 SUMA DE LOS ELEMENTOS DE LA TRIANGULAR INFERIOR DERECHA(sin la diagonal secundaria)(opuesta)(TAREA)
    public int SumaTIDsinLaSecundaria(){
        int ac=0;
        for(int i=1; i<=nfil;i++){
            for (int j=((nfil+1)-i); j<=ncol;j++){
                ac=ac+M[i][j];
            }
        }
        return ac;
    }
    //#20 SUMAR TODOS LOS DIGITOS DEL MEDIO SIN LOS NUMEROS EXTERNOS DE LA MATRIZ
    public int SumaSinFilExterna(){
        int ac=0;
        for (int i=1; i<=(nfil-1); i++){
            for (int j=1; j<=(ncol-1); j++){
                ac=ac+M[i][j];
            }
        }
        return ac;
    }
    //#21 SUMAR TODOS LOS DIGITOS EXTERNOS DE LA MATRIZ(sin los numeros del medio)
    public int SumarFilasExternas(){
        int a=this.SumaElementos();
        int b=this.SumaSinFilExterna();
        int c=a-b;
        return c;
    }   
    //#22 SUMA DE LOS ELEMENTOS DE LA VERTICAL(interna)
    public int SumaElemInternoVerti(){
        int ac=0;
        for (int i=0; i<=nfil; i++){
                for(int j=1; j<=nfil-1; j++){
                    ac=ac+M[i][j];
                }
        }
        return ac;
    }
    /*------------------------EXAMEN(FINAL) FILA A------------------------------*/
    //pregunta 1
    //#23 SUMAR DE LOS ELEMENTOS DE LA HORIZONTAL(interna)
     public int SumaElemInternoHori(){
        int ac=0;
        for (int i=1; i<=nfil-1; i++){
                for(int j=0; j<=nfil; j++){
                    ac=ac+M[i][j];
                }
        }
        return ac;
     }
    //pregunta 2
    //#24 CONTAR LOS ELEMENTOS NEGATIVOS
    public int contarTIInegativosPares(){
        int ac=0;
        for(int i=0; i<=nfil;i++){
            for (int j=0; j<=i;j++){
                if((M[i][j]<0) && (M[i][j]%2==0)){  
                        ac=ac+1;
                }
            }
        }
        return ac;
    }
     
    //Para trabajar en el main
    public void Menu(){
        System.out.println("M A T R I C E S");
        System.out.println("= = = = = = = =");
        System.out.println("1. Cargar matriz m*n");
        System.out.println("2. Mostrar matriz m*n");
        System.out.println("3. Retornar Numero de Filas de la Matriz");
        System.out.println("4. Retornar Numero de Columnas de la Matriz");
        System.out.println("5. Suma de elementos de la matriz");
        System.out.println("6. SuM de los elementos de la diagonal principal");
        System.out.println("7. Sum elementos de diagonal secundaria");
        System.out.println("8. sum elementos  Triangular Superior Izquierda");
        System.out.println("9.");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}