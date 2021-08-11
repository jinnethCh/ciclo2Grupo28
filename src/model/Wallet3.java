package model;

public class Wallet3 {
    public static final int limiteBilletera = 500000;
    /**
     * saldo de la billetera
     */
    private int saldo;
    private boolean tieneLimite;

    public Wallet3(boolean limite) {
        super();
        saldo = 0;
        tieneLimite = limite; 

    }

    public int getSaldo(){
        return saldo;

    }

    public String putSaldo(int valor){
        if (saldo + valor > limiteBilletera && tieneLimite){
                return "No puede superar el limte";
        } 
        saldo += valor;
        return "operacion exitosa, nuevo saldo " + saldo;
    }
}
//git add .
//git commit -m "mensaje"
//git push origin master