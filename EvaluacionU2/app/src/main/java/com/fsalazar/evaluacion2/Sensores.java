package com.fsalazar.evaluacion2;

public class Sensores {
    public Sensores(String nombreSensor, String valorSensor) {
        this.nombreSensor = nombreSensor;
        this.valorSensor = valorSensor;
    }

    private String nombreSensor;
    private String valorSensor;

    public String getNombreSensor() {
        return nombreSensor;
    }

    public void setNombreSensor(String nombreSensor) {
        this.nombreSensor = nombreSensor;
    }

    public String getValorSensor() {
        return valorSensor;
    }

    public void setValorSensor(String valorSensor) {
        this.valorSensor = valorSensor;
    }
}
