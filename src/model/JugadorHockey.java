package model;

public class JugadorHockey extends Persona implements IDesplazarseEnPistaConPalo, IRealizarJugada {
    protected int numero;
    protected Posicion posicion;

    public JugadorHockey(String nombre, int edad, int numero, Posicion posicion) {
        super(nombre, edad);
        this.numero = numero;
        this.posicion = posicion;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public String getNombrePosicion() {
        return posicion.toString();
    }

    @Override
    public String desplazarseConPalo() {
        return "Jugador numero " + numero + " se desplaza en la pista con el palo.";
    }

    @Override
    public String realizarJugada(int numeroJugador, int numeroReceptor) {
        return "Jugador numero " + numeroJugador + " se la pasa a Jugador numero " + numeroReceptor;
    }
}