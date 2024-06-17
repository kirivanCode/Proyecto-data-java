package modelo;

public class Cliente {

    private int idc;
    private String doc;
    private String nom_completo;
    private String direcc;
    private String telefono;
    private String correo;

    public Cliente() {
        this.idc = 0;
        this.doc = "";
        this.nom_completo = "";
        this.direcc = "";
        this.telefono = "";
        this.correo = "";
    }

    public Cliente(int idc, String doc, String nom_completo, String direcc, String telefono, String correo) {
        this.idc = idc;
        this.doc = doc;
        this.nom_completo = nom_completo;
        this.direcc = direcc;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getIdc() {
        return idc;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getNom_completo() {
        return nom_completo;
    }

    public void setNom_completo(String nom_completo) {
        this.nom_completo = nom_completo;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idc=" + idc + ", doc=" + doc + ", nom_completo=" + nom_completo + ", direcc=" + direcc + ", telefono=" + telefono + ", correo=" + correo + '}';
    }

    
}



