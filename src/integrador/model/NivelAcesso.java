package integrador.model;

public class NivelAcesso {
    private int idLevel;
    private String accessLevel;

    public int getIdLevel() {
        return idLevel;
    }

    public void setIdLevel(int idLevel) {
        this.idLevel = idLevel;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }
    
    @Override
    public String toString(){
        return this.getAccessLevel();
    }
}
