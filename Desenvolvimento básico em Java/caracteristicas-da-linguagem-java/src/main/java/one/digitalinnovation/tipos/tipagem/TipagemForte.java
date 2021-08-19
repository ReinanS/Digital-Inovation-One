package one.digitalinnovation.tipos.tipagem;

//  Não permite um mesmo dado ser tratado como se fosse de outro tipo.
public class TipagemForte {

    public static void main(String[] args) {

        String texto = "meu texto";

        //texto = 1000; //NOK

        Integer numero = Integer.valueOf("1024");

        numero = 512; //OK
    }

}
