package controller;

import beans.Player;
import beans.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class AppController {

    Scanner sc = new Scanner(System.in);

    public void registrarNuevoEquipo(ArrayList<Team> listaTeam) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        for (int i=0; i<listaTeam.size(); i++){
            if (listaTeam.get(i).getNombre().equals(nombre)){
                System.out.println("Error, ya existe el nombre");
            }
        }

        System.out.print("Pais: ");
        String pais = sc.nextLine();

        System.out.print("Iniciales: ");
        String iniciales = sc.nextLine();

        if(iniciales.length() > 3){
            System.out.println("Error, el inicial no puede tener más de 3 caracteres");
        }

        System.out.print("Estadio: ");
        String estadio = sc.nextLine();

        System.out.print("Tecnico: ");
        String tecnico = sc.nextLine();

        System.out.print("Presupuesto: ");
        String presupuestoStr = sc.nextLine();
        float presupuesto = Integer.parseInt(presupuestoStr);

        Team team1 = new Team();
        team1.setNombre(nombre);
        team1.setPais(pais);
        team1.setIniciales(iniciales);
        team1.setEstadio(estadio);
        team1.setTecnico(tecnico);
        team1.setPresupuesto(presupuesto);


        listaTeam.add(team1);
    }






    public void registrarNuevoJugador(ArrayList<Team> listaTeam, ArrayList<Player> listaJugador){
        System.out.println("-----------------------------------");
        System.out.println("---------Lista de Equipos----------");

        // MOSTRAR LOS EQUIPOS REGISTRADOS
        for (Team name : listaTeam){
            System.out.println(name.getNombre());
        }

        System.out.print("Elija un nombre de equipo: ");
        String nombreEquipo = sc.nextLine();

        for (int i=0; i<listaTeam.size(); i++){
            if (listaTeam.get(i).getNombre().equals(nombreEquipo)){
                System.out.println("Error, no existe equipo con ese nombre");
            }
        }



        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("posicion: ");
        String posicion = sc.nextLine();

        System.out.print("Numero de camiseta: ");
        String numeroCamisetaStr = sc.nextLine();
        int numeroCamiseta = Integer.parseInt(numeroCamisetaStr);

        System.out.print("Edad: ");
        String edadStr = sc.nextLine();
        int edad = Integer.parseInt(edadStr);

        System.out.print("DNI: ");
        String dniStr = sc.nextLine();
        int dni = Integer.parseInt(dniStr);

        for (int i=0; i<listaJugador.size(); i++){
            if (listaJugador.get(i).getDni().equals(dni)){
                System.out.println("Error, ya existe el dni");
            }
        }

        System.out.print("Salario: ");
        String salarioStr = sc.nextLine();
        int salario = Integer.parseInt(salarioStr);

        Player jugador1 = new Player();
        jugador1.setNombre(nombre);
        jugador1.setPosicion(posicion);
        jugador1.setNumCamiseta(numeroCamiseta);
        jugador1.setEdad(edadStr);
        jugador1.setDni(dniStr);

        listaJugador.add(jugador1);

    }


    public void listarEquipos(ArrayList<Team> listaTeam, ArrayList<Player> listaJugador){
        System.out.println("Lista de Equipos");
        for (Team team : listaTeam) {
            System.out.print("Nombre: " + team.getNombre());
            System.out.print("Pais: " + team.getPais());
            System.out.print("Iniciales: " + team.getIniciales());
            System.out.print("Estadio: " + team.getEstadio());
            System.out.print("Tecnico: " + team.getTecnico());
            System.out.print("Presupuesto: " + team.getPresupuesto());
            System.out.print("N° de jugadores: ");
        }
    }

    public void listarJugadoresXSalario(ArrayList<Team> listaTeam, ArrayList<Player> listaJugador){
        System.out.println("Lista de jugadores x salario");
        System.out.println("----------------------------------");
        System.out.print("Mayor salario a: ");
        String salarioStr = sc.nextLine();
        int salario = Integer.parseInt(salarioStr);
        /*
        for (Team team1 : listaTeam) {
            System.out.print("Nombre: " + team.getNombre());
            System.out.print("Pais: " + team.getPais());
            System.out.print("Iniciales: " + team.getIniciales());
            System.out.print("Estadio: " + team.getEstadio());
            System.out.print("Tecnico: " + team.getTecnico());
            System.out.print("Presupuesto: " + team.getPresupuesto());
            System.out.print("N° de jugadores: ");
        }*/
    }

}
