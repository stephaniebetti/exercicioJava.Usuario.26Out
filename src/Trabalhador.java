public class Trabalhador {

    private String cpf;
    private int idade;
    private int horasTrabalhadasPorDia;
    private float valorHora;
    private int diasTrabalhados;
    private float taxaPercentualHoraExtra;


    public Trabalhador(String nome, String cpf, int horasTrabalhadasPorDia, int idade, float valorHora, int diasTrabalhados, float taxaPercentualHoraExtra) {
        this.nome = nome;
        this.cpf = cpf;
        this.horasTrabalhadasPorDia = horasTrabalhadasPorDia;
        this.idade = idade;
        this.valorHora = valorHora;
        this.diasTrabalhados = diasTrabalhados;
        this.taxaPercentualHoraExtra = taxaPercentualHoraExtra;
    }

    public void printarNaTelaOTrabalhador (){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("Horas trabalhadas por dia: " + this.horasTrabalhadasPorDia);
        System.out.println("Valor da hora: " + this.valorHora);
        System.out.println("Dias trabalhados: " + this.diasTrabalhados);
        System.out.println("Taxa percentual de hora extra: " + this.taxaPercentualHoraExtra);
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getHorasTrabalhadasPorDia() {
        return horasTrabalhadasPorDia;
    }

    public void setHorasTrabalhadasPorDia(int horasTrabalhadasPorDia) {
        this.horasTrabalhadasPorDia = horasTrabalhadasPorDia;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public float getTaxaPercentualHoraExtra() {
        return taxaPercentualHoraExtra;
    }

    public void setTaxaPercentualHoraExtra(float taxaPercentualHoraExtra) {
        this.taxaPercentualHoraExtra = taxaPercentualHoraExtra;
    }

}
