package Models;

public class PessoaJuridica extends Pessoa {
    
    private String razaoSocial;
    private String cnpj;
    
    public PessoaJuridica(String razaoSocial, String cnpj, 
            String telefone, Endereco endereco, String email) {
        super(telefone, endereco, email);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
