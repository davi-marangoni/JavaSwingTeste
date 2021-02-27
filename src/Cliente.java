public class Cliente {
    private String cpf;
    private String nome;
    private Float cartao;
    public Cliente(String cpf,String nome,float cartao){
        this.cpf=cpf;
        this.nome=nome;
        this.cartao= cartao;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Float getCartao() {
        return cartao;
    }
    public void setCartao(Float cartao) {
    	
        this.cartao = cartao;
    	
    }
}