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

    public int getFk_idEmployeeLevel() {
        return fk_idEmployeeLevel;
    }

    public void setFk_idEmployeeLevel(int fk_idEmployeeLevel) {
        this.fk_idEmployeeLevel = fk_idEmployeeLevel;
    }

    public int getFk_idEmployeeSex() {
        return fk_idEmployeeSex;
    }

    public void setFk_idEmployeeSex(int fk_idEmployeeSex) {
        this.fk_idEmployeeSex = fk_idEmployeeSex;
    }

    /*public byte[] getImagem() {
        return imagem;
    }*/

    /*public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }*/

    private int idEmployee;
    private String fullname;
    private int RG;
    private String CPF;
    private String login;
    private String employeePassword;
    private int fk_idEmployeeLevel;
    private int fk_idEmployeeSex;
    //private byte[] imagem;
    
}
