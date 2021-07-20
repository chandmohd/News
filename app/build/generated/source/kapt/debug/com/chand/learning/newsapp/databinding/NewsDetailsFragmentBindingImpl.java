package com.chand.learning.newsapp.databinding;
import com.chand.learning.newsapp.R;
import com.chand.learning.newsapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NewsDetailsFragmentBindingImpl extends NewsDetailsFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_back, 6);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NewsDetailsFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private NewsDetailsFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.newsImage.setTag(null);
        this.tvDate.setTag(null);
        this.tvDescription.setTag(null);
        this.tvSourceName.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        java.lang.String itemSourceName = null;
        java.lang.String itemDescription = null;
        com.chand.learning.newsapp.data.Source itemSource = null;
        java.lang.String itemPublishedAt = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.urlToImage
                    itemUrlToImage = item.getUrlToImage();
                    // read item.description
                    itemDescription = item.getDescription();
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
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.chand.learning.newsapp.adapters.BindingAdapterKt.bindImageFromUrl(this.newsImage, itemUrlToImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, itemPublishedAt);
            com.chand.learning.newsapp.adapters.BindingAdapterKt.bindIsGone(this.tvDate, itemPublishedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDescription, itemDescription);
            com.chand.learning.newsapp.adapters.BindingAdapterKt.bindIsGone(this.tvDescription, itemDescription);
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
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}