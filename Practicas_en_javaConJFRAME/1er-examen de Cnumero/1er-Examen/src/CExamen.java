public class CExamen {
    private int n;
    public CExamen(){
        n=0;
    }
    public void ponerNum(int v){
        n=v;
    }
    public int sacarNum(){
        return n;
    }
    //pregunta 1
    public int UltimoDigito(){
        int aux=n, res=0;
        res=aux%10;
        return res;
    }
    public void repetirUltimoDig(){
        int aux=this.UltimoDigito();
        int NewNum=n*10+this.UltimoDigito();
        n=NewNum;
    }
    //pregunta 2
    public void SumarDigitoINpar(){
        int aux=n, si=0, res;
        while(aux!=0){
            res=aux%10;
            if(res %2!=0){
                si=si+res;
            }
            aux=aux/10;
        }
         n=si;
    }
    //pregunta 3
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
    public void sumarContar(){
        n=this.SumarDigitoPar()*10+this.CantDigitoINpar();
    }
}