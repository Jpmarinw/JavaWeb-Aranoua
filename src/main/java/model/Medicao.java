package model;

import javax.persistence.*;
import java.util.Calendar;

@Entity(name = "medicao")
public class Medicao{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_hora", nullable = false)
    private Calendar dataHora = Calendar.getInstance();

    @Column(nullable = false)
    private double peso;

    @Column(nullable = false)
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
