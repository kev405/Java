package PrimerEjercicio;

public abstract class banco{

    private double totalDepositado = 0.00;
    
    
    public double retirarDinero(double monto, double retiro){
        if (monto > retiro) {
            return (monto - retiro);
        }else {
            System.out.println("Saldo insuficiente");
            return monto;
        }
    }

    public double depositarDinero(double monto, double deposito){
        return (monto + deposito);
    }

    public abstract double totalDepositado(persona[] montos);

    //setters

    public void setTotalDepositado(double totalDepositado) {
        this.totalDepositado = totalDepositado;
    }

    //getters

    public double getTotalDepositado() {
        return totalDepositado;
    }
}
