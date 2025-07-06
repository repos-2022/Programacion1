public class Raiz {
    private int radicando;
    private int indice;
    public Raiz(){
        radicando=0;
        indice=1;
    }
    public void ponerRadicando(int x){
        radicando=x;
    }
     public void ponerIndice(int y){
        indice=y;
    }
    public int sacarRadicando(){
        return radicando;
    }
    public int sacarINDICE(){
        return indice;
    }
}