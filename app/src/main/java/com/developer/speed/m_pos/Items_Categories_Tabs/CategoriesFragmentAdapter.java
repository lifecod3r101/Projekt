package com.developer.speed.m_pos.Items_Categories_Tabs;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.developer.speed.m_pos.Items_Categories_Tabs.CategoriesFragmentAdapter.CategoriesViewHolder;
import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;

import java.util.List;

public class CategoriesFragmentAdapter extends Adapter<CategoriesViewHolder> {

    private final List<CategoriesFragmentProperties> categoriesDesc;

    public CategoriesFragmentAdapter(List<CategoriesFragmentProperties> categoriesDesc) {
        this.categoriesDesc = categoriesDesc;
    }

    @NonNull
    @Override
    public CategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater categoriesInflater = LayoutInflater.from(parent.getContext());
        View categoriesView = categoriesInflater.inflate(layout.categories_tab_layout, parent, false);
        return new CategoriesViewHolder(categoriesView);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesViewHolder holder, int position) {
        CategoriesFragmentProperties myCategoryProperty = this.categoriesDesc.get(position);
        holder.categoriesText.setText(myCategoryProperty.getCategory());
        holder.categoriesText.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return this.categoriesDesc.size();
    }

    public class CategoriesViewHolder extends ViewHolder {
        TextView categoriesText;

        public CategoriesViewHolder(View itemView) {
            super(itemView);
            this.categoriesText = itemView.findViewById(id.category_text);
        }
    }
}
