package com.chand.learning.newsapp.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ=\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032$\b\u0001\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/chand/learning/newsapp/api/ApiService;", "", "getHeadLines", "Lretrofit2/Response;", "Lcom/chand/learning/newsapp/data/NewsResponse;", "param", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface ApiService {
    public static final com.chand.learning.newsapp.api.ApiService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "top-headlines")
    public abstract java.lang.Object getHeadLines(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.HashMap<java.lang.String, java.lang.String> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.chand.learning.newsapp.data.NewsResponse>> p1);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/chand/learning/newsapp/api/ApiService$Companion;", "", "()V", "BASE_URL", "", "create", "Lcom/chand/learning/newsapp/api/ApiService;", "app_debug"})
    public static final class Companion {
        private static final java.lang.String BASE_URL = "https://newsapi.org/v2/";
        
        @org.jetbrains.annotations.NotNull()
        public final com.chand.learning.newsapp.api.ApiService create() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}