package com.chand.learning.newsapp.data;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\'\u00a8\u0006\b"}, d2 = {"Lcom/chand/learning/newsapp/data/ArticleDao;", "", "getArticles", "Lcom/chand/learning/newsapp/data/NewsResponse;", "insertAll", "", "article", "updateData", "app_debug"})
public abstract interface ArticleDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM news")
    public abstract com.chand.learning.newsapp.data.NewsResponse getArticles();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.chand.learning.newsapp.data.NewsResponse article);
    
    @androidx.room.Update()
    public abstract void updateData(@org.jetbrains.annotations.NotNull()
    com.chand.learning.newsapp.data.NewsResponse article);
}