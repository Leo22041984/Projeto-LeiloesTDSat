
/**
 *
 * @author Adm
 */
public class ProdutosDTO {

    private String nome;
    private Integer valor;
    private String status;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
