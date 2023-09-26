package factory;



public class Fabrica  {

    public static Carro Fabrica(Tipo opc){
        Carro c=null;
        if(opc.equals(Tipo.FOX)){
            c=new Fox(123,"Fox Urban");
        }else if(opc.equals(Tipo.JETTA)){
            c=new Jetta(45000,"Jetta GLT");
        }
        return c;
    }
}
