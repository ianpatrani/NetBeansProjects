package domain;

public class Usuario {

    private String username;
    private String password;
    private int id_usuario;

    public Usuario() {

    }

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Usuario(int i, String nombre, String password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", password=" + password + ", id_usuario=" + id_usuario + '}';
    }

}
