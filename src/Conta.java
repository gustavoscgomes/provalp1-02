public class Conta {
    private double saldo;
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double deposito() {
        saldo += valor;
        return saldo;
    }
    public double saque() {
        saldo -= valor;
        return saldo;
    }
}
