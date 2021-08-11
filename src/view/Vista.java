package view;
import model.Wallet3;

public class Vista {
    
    public static void main(String[] args) {
        //crear objeto de la clase en esta clase viista
        Wallet3 wallet1 = new Wallet3(true);
        Wallet3 wallet2 = new Wallet3(false);

        String saldo1 = wallet1.putSaldo(600000);
        //System.out.println(wallet1.getSaldo());
        System.out.println(saldo1);
        String saldo2 = wallet2.putSaldo(600000);
        //System.out.println(wallet2.getSaldo());
        System.out.println(saldo2);

        wallet2.getSaldo();
        
    }
}
