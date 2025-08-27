import java.util.Calendar;

public class Medicao{

    private Calendar dataHora = Calendar.getInstance();
    private double peso;
    private double altura;

    public Calendar getDataHora() {
        return dataHora;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
