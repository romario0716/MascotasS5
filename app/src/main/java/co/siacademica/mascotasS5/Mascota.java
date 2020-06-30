package co.siacademica.mascotasS5;

public class Mascota {

    private int foto;
    private String nombre;
    private int ranking;
    private int id;

    public Mascota(int foto, String nombre, int ranking) {
        this.foto = foto;
        this.nombre = nombre;
        this.ranking = ranking;
    }
    public Mascota(){

    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
