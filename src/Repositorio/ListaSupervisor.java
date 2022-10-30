package Repositorio;

import domain.Supervisor;
import java.util.ArrayList;
import java.util.List;

public class ListaSupervisor {
    public static List<Supervisor> supervisor = new ArrayList<>();

    public static void adicionar(Supervisor sur){
        supervisor.add(sur);
    }

    public static List<Supervisor> retornarTodos(){
        return supervisor;
    }


    public static Supervisor retornar(Integer id) {
        return null;
    }
}
