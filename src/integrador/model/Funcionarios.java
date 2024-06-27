package integrador.model;

public class Funcionarios {

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public Sexualidades getSexualidades() {
        return sexualidades;
    }

    public void setSexualidades(Sexualidades sexualidade) {
        this.sexualidades = sexualidade;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelacesso;
    }

    public void setNivelAcesso(NivelAcesso nivelacesso) {
        this.nivelacesso = nivelacesso;
    }

    private int idEmployee;
    private String fullname;
    private int RG;
    private String CPF;
    private String login;
    private String employeePassword;
    private NivelAcesso nivelacesso;
    private Sexualidades sexualidades;
    
}
