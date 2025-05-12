package com.golovanov.web_portal.domain.repositories.review;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/golovanov/web_portal/domain/repositories/review/ReviewRepository;", "Lorg/springframework/data/repository/kotlin/CoroutineCrudRepository;", "Lcom/golovanov/web_portal/domain/entities/Review;", "", "findAllByPostId", "Lkotlinx/coroutines/flow/Flow;", "postId", "web-portal"})
public abstract interface ReviewRepository extends org.springframework.data.repository.kotlin.CoroutineCrudRepository<com.golovanov.web_portal.domain.entities.Review, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.golovanov.web_portal.domain.entities.Review> findAllByPostId(long postId);
}