import throwethrows.LimiteSaqueException;
import throwethrows.Saque;

public class Main {
    public static void main(String[] args) {
        try {
            Saque.saqueMoeda(700.00);
        } catch (LimiteSaqueException e) {
            System.out.println(e.getMessage());
        }
    }
}