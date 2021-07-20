package com.chand.learning.newsapp.databinding;
import com.chand.learning.newsapp.R;
import com.chand.learning.newsapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemNewsBindingImpl extends ItemNewsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.br, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemNewsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemNewsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.Barrier) bindings[5]
            , (com.google.android.material.card.MaterialCardView) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.cardView.setTag(null);
        this.newsImage.setTag(null);
        this.tvDate.setTag(null);
        this.tvSourceName.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.item == variableId) {
            setItem((com.chand.learning.newsapp.data.Article) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.chand.learning.newsapp.data.Article Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.chand.learning.newsapp.data.Article item = mItem;
        java.lang.String itemTitle = null;
        java.lang.String itemUrlToImage = null;
        android.view.View.OnClickListener clickListener = mClickListener;
        java.lang.String itemSourceName = null;
        com.chand.learning.newsapp.data.Source itemSource = null;
        java.lang.String itemPublishedAt = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (item != null) {
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.urlToImage
                    itemUrlToImage = item.getUrlToImage();
                    // read item.source
                    itemSource = item.getSource();
                    // read item.publishedAt
                    itemPublishedAt = item.getPublishedAt();
                }


                if (itemSource != null) {
                    // read item.source.name
                    itemSourceName = itemSource.getName();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.cardView.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.chand.learning.newsapp.adapters.BindingAdapterKt.bindImageFromUrl(this.newsImage, itemUrlToImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, itemPublishedAt);
            com.chand.learning.newsapp.adapters.BindingAdapterKt.bindIsGone(this.tvDate, itemPublishedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSourceName, itemSourceName);
            com.chand.learning.newsapp.adapters.BindingAdapterKt.bindIsGone(this.tvSourceName, itemSourceName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, itemTitle);
            com.chand.learning.newsapp.adapters.BindingAdapterKt.bindIsGone(this.tvTitle, itemTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}