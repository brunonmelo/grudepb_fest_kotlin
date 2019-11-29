package com.grudepb.fest.kotlin.api.controller.autenticacao;

import com.grudepb.fest.kotlin.api.controller.BaseController;
import com.grudepb.fest.kotlin.api.controller.annotation.RestResource;
import com.grudepb.fest.kotlin.api.controller.annotation.RestService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
// import com.grudepb.fest.kotlin.api.presentation.Response;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestResource(path = "/auth")
@Api(value = "Auth", description = "Autenticação do usuário")
public class AutenticacaoController extends BaseController {

    // private AutenticacaoService autenticacaoService;

    @Autowired
    public AutenticacaoController() {
        // this.autenticacaoService = autenticacaoService;
    }


    @RestService(path = "/autenticar", method = GET, code = OK)
    public String consultarAcordoSugerido(@RequestParam String cpf) {
        return "teste";
//        return convertToResponse(autenticarService.autenticar(cpf));
    }


}
