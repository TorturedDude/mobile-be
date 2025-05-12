package com.golovanov.web_portal.configuration;

@org.springframework.context.annotation.Configuration()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017\u00a8\u0006\u0005"}, d2 = {"Lcom/golovanov/web_portal/configuration/EnvConfig;", "", "()V", "dotEnv", "Lio/github/cdimascio/dotenv/Dotenv;", "web-portal"})
public class EnvConfig {
    
    public EnvConfig() {
        super();
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public io.github.cdimascio.dotenv.Dotenv dotEnv() {
        return null;
    }
}