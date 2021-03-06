package com.gallopmark.recycler.adapterhelper;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import java.util.List;

public abstract class CommonAdapter<T> extends InnerAdapter<T> {

    public CommonAdapter(Context context, List<T> mDatas) {
        super(context, mDatas);
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RecyclerHolder(mLayoutInflater.inflate(bindView(viewType), parent, false));
    }

    protected abstract int bindView(int viewType);
}
