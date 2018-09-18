package revisaopa_univates;
/**
 *
 * @author jonasdhein
 */
public class Conta {
    
    private String nome;
    private int conta;
    private Double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome2) {
        nome = nome2;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public void saque(Double valor){
        saldo = saldo - valor;
    }
    
    public void deposito(Double valor){
        saldo = saldo + valor;
    }
    
    public String toString(){
        return "---\nConta: " + conta + "\n" +
               "Nome: " + nome + "\n" + 
               "Saldo: " + saldo +
               "\n---";
    }
    
}
