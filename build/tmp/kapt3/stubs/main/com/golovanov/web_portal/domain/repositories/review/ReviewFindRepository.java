package com.golovanov.web_portal.domain.repositories.review;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/golovanov/web_portal/domain/repositories/review/ReviewFindRepository;", "", "findAllByPostId", "", "Lcom/golovanov/web_portal/domain/entities/Review;", "postId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "web-portal"})
public abstract interface ReviewFindRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findAllByPostId(long postId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.golovanov.web_portal.domain.entities.Review>> $completion);
}