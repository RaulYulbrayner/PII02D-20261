package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Funcion implements ActoCirco {

    private String nombre;
    private List<ActoCirco> actos = new ArrayList<>();

    public Funcion(String nombre) {
        this.nombre = nombre;
    }

    public void agregarActo(ActoCirco actoCirco){
        actos.add(actoCirco);
    }

    @Override
    public void presentarActo(String estructura) {
        System.out.println(estructura + nombre);
        for(int i = 0; i < actos.size(); i++){
            ActoCirco actoCirco = actos.get(i);
            String nuevo = estructura + " | ";
            actoCirco.presentarActo(estructura);
        }
    }
}
