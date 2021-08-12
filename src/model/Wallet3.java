package model;

public class Wallet3 {
    public static final int limiteBilletera = 500000;
    /**
     * saldo de la billetera
     */
    private int saldo;
    private boolean tieneLimite;
    private int meta;

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
        if(verificarMeta()){System.out.println("has superado la meta");}
        return "operacion exitosa, nuevo saldo " + saldo;
    }

    public String definirMeta(int valor){
        if(valor > limiteBilletera && tieneLimite){
            return "No puedes establecer una meta mas alta que el limite";
        }
        if(valor <= saldo){
            return "ya has superado";
        }
        meta = valor;
        return "nueva meta agregada!";
    }

    public boolean verificarMeta(){
        if(saldo >= meta && meta >= 0){
            return true;
        }
        return false;
    }
}
//git add .
//git commit -m "mensaje"
//git push origin master