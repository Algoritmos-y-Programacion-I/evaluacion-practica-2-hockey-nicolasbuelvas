package model;

import java.util.Random;

public class Controller {

    private Equipo[] equipos;
    private Arbitro[] arbitros;
    private final int CANTIDAD_EQUIPOS = 4;
    private final int CANTIDAD_ARBITROS = 4;

    /**
     * Constructor de la clase Controller para inicializar variables globales.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Controller con un arreglo de equipos y árbitros.
     */
    public Controller() {
        equipos = new Equipo[CANTIDAD_EQUIPOS];
        arbitros = new Arbitro[CANTIDAD_ARBITROS];
        inicializarArbitros();
    }

    public String fixture() {
        String fixture = "";
        Random random = new Random();
        int equipo1 = random.nextInt(CANTIDAD_EQUIPOS);
        int equipo2;
        do {
            equipo2 = random.nextInt(CANTIDAD_EQUIPOS);
        } while (equipo2 == equipo1);

        fixture += "Partido 1: Equipo " + equipo1 + " vs Equipo " + equipo2 + "\n";

        do {
            equipo1 = random.nextInt(CANTIDAD_EQUIPOS);
            equipo2 = random.nextInt(CANTIDAD_EQUIPOS);
        } while (equipo2 == equipo1);

        fixture += "Partido 2: Equipo " + equipo1 + " vs Equipo " + equipo2;
        return fixture;
    }

    public void precargarInformacion() {
        // No me alcanzado el tiempo D:
    }

/**
     * Simula una secuencia de pases y un gol.
     */
    public void simularJugada() {
        Random random = new Random();
        System.out.println("Simulando jugada de gol...");

        int[] jugadores = {1, 10, 9, 3, 7, 9};
        
        for (int i = 0; i < 5; i++) {
            // Simula pase entre jugadores
            System.out.println("Jugador numero " + jugadores[i] + " se la pasa a Jugador numero " + jugadores[i + 1]);

            // Alterna movimiento de arbitros al azar
            int arbitroIndex = random.nextInt(CANTIDAD_ARBITROS);
            System.out.println(arbitros[arbitroIndex].desplazarse());
        }
        
        System.out.println("Jugador numero " + jugadores[5] + " entra el disco en la red. Gol!");
    }

    private void inicializarArbitros() {
        arbitros[0] = new ArbitroPrincipal("Arbitro Principal 1", 40);
        arbitros[1] = new ArbitroPrincipal("Arbitro Principal 2", 35);
        arbitros[2] = new JuezDeLinea("Juez de Linea 1", 30);
        arbitros[3] = new JuezDeLinea("Juez de Linea 2", 32);
    }
}