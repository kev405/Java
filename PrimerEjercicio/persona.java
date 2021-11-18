package PrimerEjercicio;

public class persona extends banco{
    
    private int codigo;
    private String nombre;
    private double monto;
    private double monto2;

    //constructor

    public persona(int codigo, String nombre, double monto){
        this.codigo = codigo;
        this.nombre = nombre;
        this.monto = monto; 
    }

    //setters

    public void setMonto(double monto) {
        this.monto = monto;
    }

    //getters

    public int getCodigo() {
        return codigo;
    }
    public double getMonto() {
        return monto;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public double totalDepositado(persona[] montos) {
        double monto3 = 0;

        for(int i = 0; i < montos.length; i++){
            double monto2 = montos[i].monto;
            monto3 = monto3 + monto2;
        }
        return monto3;
    }
}
