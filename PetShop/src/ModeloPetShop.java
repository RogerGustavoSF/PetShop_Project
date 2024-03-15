
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface varGlobal {

    ArrayList<ModeloPetShop> infoGerais = new ArrayList<>();
}

public class ModeloPetShop {

    private static Integer contadorId = 0;

    private static ModeloPetShop instanciaCompartilhada;

    public static ModeloPetShop getInstanciaCompartilhada() {
        if (instanciaCompartilhada == null) {
            instanciaCompartilhada = new ModeloPetShop();
        }
        return instanciaCompartilhada;
    }

    // Dados do Cliente:
    private Integer id;
    private String nome;
    private String telefone;
    private String email;
    private String tipoServico;
    private String data;

    // Dados do Pet:
    private String tipoPet;
    private String nomePet;
    private String racaPet;
    private String idadePet;

    public ModeloPetShop() {
        this.data = gerarDataFormatada();
    }

    public ModeloPetShop(Integer id, String nome, String telefone, String email, String tipoServico, LocalDate data) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.tipoServico = tipoServico;
        this.data = gerarDataFormatada();
    }

    public ModeloPetShop(String nome, String telefone, String email, String tipoServico,
            LocalDate data, String tipoPet, String nomePet, String racaPet, String idadePet) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.tipoServico = tipoServico;
        this.data = gerarDataFormatada();

        this.tipoPet = tipoPet;
        this.nomePet = nomePet;
        this.racaPet = racaPet;
        this.idadePet = idadePet;
    }

    public ModeloPetShop(Integer id, String nome, String telefone, String email, String tipoServico,
            String data, String tipoPet, String nomePet, String racaPet, String idadePet) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.tipoServico = tipoServico;
        this.data = data;

        this.tipoPet = tipoPet;
        this.nomePet = nomePet;
        this.racaPet = racaPet;
        this.idadePet = idadePet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipoPet() {
        return tipoPet;
    }

    public void setTipoPet(String tipoPet) {
        this.tipoPet = tipoPet;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getRacaPet() {
        return racaPet;
    }

    public void setRacaPet(String racaPet) {
        this.racaPet = racaPet;
    }

    public String getIdadePet() {
        return idadePet;
    }

    public void setIdadePet(String idadePet) {
        this.idadePet = idadePet;
    }

    public Integer incrementaId() {
        return ++contadorId;
    }

    public final String gerarDataFormatada() {
        DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.now().format(data);
    }

    public ArrayList<ModeloPetShop> listaDados() {
        return varGlobal.infoGerais;
    }
    
    public void cadastrarDados(ModeloPetShop novoDado) {
        novoDado.setData(gerarDataFormatada()); // Atualiza para a data atual
        varGlobal.infoGerais.add(novoDado);
    }
    
    public int tamanhoLista(){
        return varGlobal.infoGerais.size();
    }
}
