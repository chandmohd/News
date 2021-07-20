package com.chand.learning.newsapp.data;

import java.lang.System;

@androidx.room.Entity(tableName = "news")
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J/\u0010\u0015\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lcom/chand/learning/newsapp/data/NewsResponse;", "", "articles", "", "Lcom/chand/learning/newsapp/data/Article;", "status", "", "totalResults", "", "(Ljava/util/List;Ljava/lang/String;I)V", "getArticles", "()Ljava/util/List;", "getStatus", "()Ljava/lang/String;", "getTotalResults", "()I", "setTotalResults", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class NewsResponse {
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.chand.learning.newsapp.data.Article> articles = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @androidx.room.PrimaryKey(autoGenerate = false)
    private int totalResults;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.chand.learning.newsapp.data.Article> getArticles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final int getTotalResults() {
        return 0;
    }
    
    public final void setTotalResults(int p0) {
    }
    
    public NewsResponse(@org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverters(value = {com.chand.learning.newsapp.data.ArticlesConverter.class})
    java.util.List<com.chand.learning.newsapp.data.Article> articles, @org.jetbrains.annotations.NotNull()
    java.lang.String status, int totalResults) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.chand.learning.newsapp.data.Article> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.chand.learning.newsapp.data.NewsResponse copy(@org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverters(value = {com.chand.learning.newsapp.data.ArticlesConverter.class})
    java.util.List<com.chand.learning.newsapp.data.Article> articles, @org.jetbrains.annotations.NotNull()
    java.lang.String status, int totalResults) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}