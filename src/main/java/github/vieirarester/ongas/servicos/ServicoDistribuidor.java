/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github.vieirarester.ongas.servicos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import github.vieirarester.ongas.modelo.ModelDistribuidor;
import github.vieirarester.ongas.modelo.entidades.Distribuidor;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Ester
 */
@Path("/distribuidor")
public class ServicoDistribuidor {

    ModelDistribuidor modelDistribuidor;

    public ServicoDistribuidor() {
        modelDistribuidor = new ModelDistribuidor();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/buscar")
    public String buscarDistribuidores() {
        String json = "";

        List<Distribuidor> distribuidores = modelDistribuidor.recuperarDistribuidores();

        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
        json = gson.toJson(distribuidores);

        return json;
    }

}
