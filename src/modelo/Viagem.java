package modelo;

import java.time.LocalDate;

public class Viagem {
    private LocalDate data;
    private Motorista motorista;
    private Passageiro passageiro;
    private double valor;

    public Viagem() {
    }

    public Viagem(LocalDate data, Motorista motorista, Passageiro passageiro, double valor) {
        this.data = data;
        this.motorista = motorista;
        this.passageiro = passageiro;
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public Motorista getMotorista() {
        return motorista;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    public Passageiro getPassageiro() {
        return passageiro;
    }
    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("Data: %s - Motorista: %s - Passageiro: %s - valor da viagem: %.2f", 
                                data, motorista.getNome(), passageiro.getNome(), valor);
    }   
}
