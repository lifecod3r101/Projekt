package com.developer.speed.m_pos.data_package_one.accessible.Items_Categories_Tabs;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.developer.speed.m_pos.R;
import com.developer.speed.m_pos.R.layout;

import java.util.List;

public class CategoriesFragmentAdapter extends Adapter<CategoriesFragmentAdapter.CategoriesViewHolder> {

    private final List<CategoriesFragmentProperties> categoriesDesc;

    public CategoriesFragmentAdapter(List<CategoriesFragmentProperties> categoriesDesc) {
        this.categoriesDesc = categoriesDesc;
    }

    @NonNull
    @Override
    public CategoriesFragmentAdapter.CategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater categoriesInflater = LayoutInflater.from(parent.getContext());
        View categoriesView = categoriesInflater.inflate(layout.categories_tab_layout, parent, false);
        return new CategoriesFragmentAdapter.CategoriesViewHolder(categoriesView);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesFragmentAdapter.CategoriesViewHolder holder, int position) {
        CategoriesFragmentProperties myCategoryProperty = categoriesDesc.get(position);
        holder.categoriesText.setText(myCategoryProperty.getCategory());
        holder.categoriesText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return categoriesDesc.size();
    }

    public class CategoriesViewHolder extends RecyclerView.ViewHolder {
        TextView categoriesText;

        public CategoriesViewHolder(View itemView) {
            super(itemView);
            categoriesText = itemView.findViewById(R.id.category_text);
        }
    }
}
