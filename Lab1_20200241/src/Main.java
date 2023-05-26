import beans.Player;
import beans.Team;
import controller.AppController;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Team> listaTeam = new ArrayList<>();
        ArrayList<Player> listaJugador = new ArrayList<>();

        AppController appController = new AppController();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                Menú");
        System.out.println("1 <- Registrar Nuevo Equipo");
        System.out.println("2 <- Registrar Nuevo Jugador");
        System.out.println("3 <- Lista de jugadores x salario");
        System.out.println("4 <- Lista de equipos");
        System.out.println("5 <- Lista de jugadores x equipo");
        System.out.println("9 <- Salir");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        System.out.print("Ingrese opción : ");

        Scanner sc = new Scanner(System.in);
        String opt = sc.nextLine();


        switch (opt) {

            case "1":
                System.out.println("Registrar Nuevo Equipo");
                appController.registrarNuevoEquipo(listaTeam);
                break;

            case "2":
                System.out.println("Registrar Nuevo Jugador");
                appController.registrarNuevoJugador(listaTeam, listaJugador);
                break;

            case "3":
                System.out.println("Lista de jugadores por salario");
                appController.listarJugadoresXSalario(listaTeam,listaJugador);
                break;

            case "4":
                System.out.println("Lista de Equipos");
                appController.listarEquipos(listaTeam,listaJugador);
                break;

            case "5":
                System.out.println("Lista de jugadores x equipo");
                // appController.listarJugadoresXEquipo(listaTeam,listaJugador);
                break;

            case "9":
                System.out.println("--- Cerrando Programa ---");
                break;

            default:
                System.out.println("Ingrese una opción válida");
                return;                                                     // Para que no se guarde el equipo en la lista...
        }


    }
}