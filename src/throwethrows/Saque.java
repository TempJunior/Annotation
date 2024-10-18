package throwethrows;

public class Saque {
    public static void saqueMoeda(Double valor) throws LimiteSaqueException{
        if (valor >400){
            LimiteSaqueException erro = new LimiteSaqueException("Valor superior ao limite diario");
            throw erro;
        }else {
            System.out.println("Valor retirado: "+valor);
        }
    }
}
