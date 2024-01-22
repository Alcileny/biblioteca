import java.time.LocalDate;
import java.time.LocalTime;

public class ReservarSala {
    private int id;
    private LocalDate data;
    private LocalTime hora; 
    private Usuario usuario;

    public ReservarSala(int id, LocalDate data, LocalTime hora,  Usuario usuario) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.usuario = usuario;
    }
    public void reservarSala() {
        System.out.println("Sala reservada");
    }

    public void cancelarReserva() {
        System.out.println("Reserva cancelada");
    }

    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}


    


