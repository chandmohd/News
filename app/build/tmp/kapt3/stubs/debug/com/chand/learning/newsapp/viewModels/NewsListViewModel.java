package com.chand.learning.newsapp.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/chand/learning/newsapp/viewModels/NewsListViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/chand/learning/newsapp/data/NewsRepository;", "(Lcom/chand/learning/newsapp/data/NewsRepository;)V", "_news", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/chand/learning/newsapp/data/Article;", "job", "Lkotlinx/coroutines/Job;", "news", "Landroidx/lifecycle/LiveData;", "getNews", "()Landroidx/lifecycle/LiveData;", "getNewsHeadlines", "", "onCleared", "app_debug"})
public final class NewsListViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.chand.learning.newsapp.data.Article>> _news = null;
    private kotlinx.coroutines.Job job;
    private final com.chand.learning.newsapp.data.NewsRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.chand.learning.newsapp.data.Article>> getNews() {
        return null;
    }
    
    public final void getNewsHeadlines() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public NewsListViewModel(@org.jetbrains.annotations.NotNull()
    com.chand.learning.newsapp.data.NewsRepository repository) {
        super();
    }
}