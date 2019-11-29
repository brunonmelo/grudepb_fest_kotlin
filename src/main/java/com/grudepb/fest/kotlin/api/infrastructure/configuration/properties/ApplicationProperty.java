package com.grudepb.fest.kotlin.api.infrastructure.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("grudepb-fest-kotlin")
public class ApplicationProperty {

    private ApiInfo apiInfo = new ApiInfo();

    public ApiInfo getApiInfo() {
        return apiInfo;
    }

    public void setApiInfo(ApiInfo apiInfo) {
        this.apiInfo = apiInfo;
    }

    public static class ApiInfo {
        private String titulo;
        private String descricao;
        private String versao;
        private String pacote;

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public String getVersao() {
            return versao;
        }

        public void setVersao(String versao) {
            this.versao = versao;
        }

        public String getPacote() {
            return pacote;
        }

        public void setPacote(String pacote) {
            this.pacote = pacote;
        }
    }

}
