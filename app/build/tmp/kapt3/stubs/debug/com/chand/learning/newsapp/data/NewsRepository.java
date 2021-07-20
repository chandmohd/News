package com.chand.learning.newsapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB;\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\t\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/chand/learning/newsapp/data/NewsRepository;", "Lcom/chand/learning/newsapp/api/SafeApiRequest;", "api", "Lcom/chand/learning/newsapp/api/ApiService;", "db", "Lcom/chand/learning/newsapp/data/AppDataBase;", "param", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "(Lcom/chand/learning/newsapp/api/ApiService;Lcom/chand/learning/newsapp/data/AppDataBase;Ljava/util/HashMap;)V", "getNewsHeadLines", "Lcom/chand/learning/newsapp/data/NewsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class NewsRepository extends com.chand.learning.newsapp.api.SafeApiRequest {
    private final com.chand.learning.newsapp.api.ApiService api = null;
    private final com.chand.learning.newsapp.data.AppDataBase db = null;
    private final java.util.HashMap<java.lang.String, java.lang.String> param = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "NewsRepository";
    private static volatile com.chand.learning.newsapp.data.NewsRepository instance;
    public static final com.chand.learning.newsapp.data.NewsRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNewsHeadLines(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.chand.learning.newsapp.data.NewsResponse> p0) {
        return null;
    }
    
    private NewsRepository(com.chand.learning.newsapp.api.ApiService api, com.chand.learning.newsapp.data.AppDataBase db, java.util.HashMap<java.lang.String, java.lang.String> param) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J:\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/chand/learning/newsapp/data/NewsRepository$Companion;", "", "()V", "TAG", "", "instance", "Lcom/chand/learning/newsapp/data/NewsRepository;", "getInstance", "api", "Lcom/chand/learning/newsapp/api/ApiService;", "db", "Lcom/chand/learning/newsapp/data/AppDataBase;", "param", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.chand.learning.newsapp.data.NewsRepository getInstance(@org.jetbrains.annotations.NotNull()
        com.chand.learning.newsapp.api.ApiService api, @org.jetbrains.annotations.NotNull()
        com.chand.learning.newsapp.data.AppDataBase db, @org.jetbrains.annotations.NotNull()
        java.util.HashMap<java.lang.String, java.lang.String> param) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}