package com.golovanov.web_portal.domain.repositories.course;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/golovanov/web_portal/domain/repositories/course/CourseFindRepositoryImpl;", "Lcom/golovanov/web_portal/domain/repositories/course/CourseFindRepository;", "databaseClient", "Lorg/springframework/r2dbc/core/DatabaseClient;", "(Lorg/springframework/r2dbc/core/DatabaseClient;)V", "findAllByUsername", "", "Lcom/golovanov/web_portal/domain/entities/Course;", "username", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "web-portal"})
public final class CourseFindRepositoryImpl implements com.golovanov.web_portal.domain.repositories.course.CourseFindRepository {
    @org.jetbrains.annotations.NotNull()
    private final org.springframework.r2dbc.core.DatabaseClient databaseClient = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String FIND_ALL_BY_USER_ID = "\n            SELECT * FROM courses c\n            JOIN course_users cu on cu.course_id = c.id\n            JOIN users u on u.id = c.user.id\n            WHERE u.username = :username\n        ";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.function.BiFunction<io.r2dbc.spi.Row, io.r2dbc.spi.RowMetadata, com.golovanov.web_portal.domain.entities.Course> mapperList = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.golovanov.web_portal.domain.repositories.course.CourseFindRepositoryImpl.Companion Companion = null;
    
    public CourseFindRepositoryImpl(@org.jetbrains.annotations.NotNull()
    org.springframework.r2dbc.core.DatabaseClient databaseClient) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object findAllByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.golovanov.web_portal.domain.entities.Course>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/golovanov/web_portal/domain/repositories/course/CourseFindRepositoryImpl$Companion;", "", "()V", "FIND_ALL_BY_USER_ID", "", "mapperList", "Ljava/util/function/BiFunction;", "Lio/r2dbc/spi/Row;", "Lio/r2dbc/spi/RowMetadata;", "Lcom/golovanov/web_portal/domain/entities/Course;", "web-portal"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}