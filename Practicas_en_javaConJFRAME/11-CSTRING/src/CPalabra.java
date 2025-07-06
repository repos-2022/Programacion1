public class CPalabra {
    private String texto;
    public CPalabra(){
        texto="";
    }
    public void SetPalabra(String T){//set=establecer-poner
        texto=T;
    }
    public String GetPalabra(){//get=conseguir-sacar
        return texto;
    }
    //#3 Combertir a mayuscula
    public void ComvertirMayusala(){
        texto=texto.toUpperCase();
    }
    //#4 Combertir a minuscula
    public void ComvertirMinuscula(){
        texto=texto.toLowerCase();
    }
    //#5 se eliminaron los espacios
    public void EliminarEspacios(){
        //Dato oldCrat viejo texto----newChard nuevo texto
        texto=texto.replace(" ","");
        //el que esta con espacios " " es el antes
        //el que esta sin espacios "" es el despues
    }
    //#6 cantidad de caracteres
    public int longitudTexto(){//CantidadCaracteres
        return texto.length();
        //dato, esto tambien cuenta los espacios
    }
    //#7 obtener un caractere de una posicion
    public char GetCaractere(int posi){//ConseguirCaractere
        return (texto.charAt(posi -1));
    }
    //#8 contar vocales
    public int contarVocales(){
        int cv=0;
        int n=this.longitudTexto();
        char car;
        for(int i=0; i<n; i++){
            car=this.GetCaractere(i+1);
            if(car=='a'|| car=='e'|| car=='i'|| car=='o'|| car=='u'){
                cv++;
            }
        }
        return cv;
    }
    //#9 contar consonates
    public int contarConsonates(){
       
        int cc=0;
        int n=this.longitudTexto();
        char car;
        for(int i=0; i<n; i++){
            car=this.GetCaractere(i+1);
            if(car!='a'&& car!='e'&& car!='i'&& car!='o'&& car!='u'&& car!=' '){
                cc++;
            }
        }
        return cc;
        //alternativa:
        //return  this.longitudTexto()-this.contarVocales();
    }
    //#10
}