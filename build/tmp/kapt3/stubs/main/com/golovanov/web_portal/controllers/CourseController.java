package com.golovanov.web_portal.controllers;

@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"api/course"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\f\u001a\u00020\u0007H\u0017J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\u0006H\u0017J\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0017J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0013H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/golovanov/web_portal/controllers/CourseController;", "", "courseService", "Lcom/golovanov/web_portal/services/CourseService;", "(Lcom/golovanov/web_portal/services/CourseService;)V", "create", "Lreactor/core/publisher/Mono;", "", "courseDto", "Lcom/golovanov/web_portal/domain/dtos/course/CourseCreateDto;", "get", "Lcom/golovanov/web_portal/domain/dtos/course/CourseDto;", "id", "getAll", "", "getAllForUser", "userDetails", "Lorg/springframework/security/core/userdetails/UserDetails;", "update", "Lcom/golovanov/web_portal/domain/dtos/course/CourseEditDto;", "web-portal"})
public class CourseController {
    @org.jetbrains.annotations.NotNull()
    private final com.golovanov.web_portal.services.CourseService courseService = null;
    
    public CourseController(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.services.CourseService courseService) {
        super();
    }
    
    @org.springframework.web.bind.annotation.GetMapping()
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<java.util.List<com.golovanov.web_portal.domain.dtos.course.CourseDto>> getAll() {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<com.golovanov.web_portal.domain.dtos.course.CourseDto> get(@org.springframework.web.bind.annotation.PathVariable()
    long id) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/me"})
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<java.util.List<com.golovanov.web_portal.domain.dtos.course.CourseDto>> getAllForUser(@org.springframework.security.core.annotation.AuthenticationPrincipal()
    @org.jetbrains.annotations.NotNull()
    org.springframework.security.core.userdetails.UserDetails userDetails) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PostMapping()
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<java.lang.Long> create(@org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.dtos.course.CourseCreateDto courseDto) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PutMapping(value = {"/{id}"})
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<com.golovanov.web_portal.domain.dtos.course.CourseDto> update(@org.springframework.web.bind.annotation.PathVariable()
    long id, @org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.dtos.course.CourseEditDto courseDto) {
        return null;
    }
}