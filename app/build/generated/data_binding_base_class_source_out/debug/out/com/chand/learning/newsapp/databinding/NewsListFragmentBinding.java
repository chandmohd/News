// Generated by data binding compiler. Do not edit!
package com.chand.learning.newsapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.chand.learning.newsapp.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class NewsListFragmentBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView rvNews;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView toolbarTitle;

  protected NewsListFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView rvNews, Toolbar toolbar, TextView toolbarTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rvNews = rvNews;
    this.toolbar = toolbar;
    this.toolbarTitle = toolbarTitle;
  }

  @NonNull
  public static NewsListFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.news_list_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static NewsListFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<NewsListFragmentBinding>inflateInternal(inflater, R.layout.news_list_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static NewsListFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.news_list_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static NewsListFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<NewsListFragmentBinding>inflateInternal(inflater, R.layout.news_list_fragment, null, false, component);
  }

  public static NewsListFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static NewsListFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (NewsListFragmentBinding)bind(component, view, R.layout.news_list_fragment);
  }
}
