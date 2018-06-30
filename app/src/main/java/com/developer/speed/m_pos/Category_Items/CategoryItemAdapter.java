package com.developer.speed.m_pos.Category_Items;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.developer.speed.m_pos.Category_Items.CategoryItemAdapter.CategoryItemViewHolder;
import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;

import java.util.List;

public class CategoryItemAdapter extends Adapter<CategoryItemViewHolder> {
    Context categoryItemContext;
    List<CategoryItemProperties> mycategoryItemProperties;

    public CategoryItemAdapter(Context categoryItemContext, List<CategoryItemProperties> mycategoryItemProperties) {
        this.categoryItemContext = categoryItemContext;
        this.mycategoryItemProperties = mycategoryItemProperties;
    }

    @NonNull
    @Override
    public CategoryItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater itemcategoryInflater = LayoutInflater.from(this.categoryItemContext);
        View view = itemcategoryInflater.inflate(layout.category_item_recycler, null);
        return new CategoryItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryItemViewHolder holder, int position) {
        CategoryItemProperties myCategoryItemProperties = this.mycategoryItemProperties.get(position);
        holder.catCode.setText(myCategoryItemProperties.getItemCatCode());
        holder.catName.setText(myCategoryItemProperties.getItemCatName());
        holder.catQuantity.setText(Integer.toString(myCategoryItemProperties.getItemCatQuantity()));
        holder.catPrice.setText(Double.toString(myCategoryItemProperties.getItemCatPrice()));
    }

    @Override
    public int getItemCount() {
        return this.mycategoryItemProperties.size();
    }

    public class CategoryItemViewHolder extends ViewHolder {
        CardView catCard;
        TextView catCode, catName, catQuantity, catPrice;

        public CategoryItemViewHolder(View itemView) {
            super(itemView);
            this.catCard = itemView.findViewById(id.category_items_card);
            this.catCode = itemView.findViewById(id.category_items_code);
            this.catName = itemView.findViewById(id.category_items_name);
            this.catQuantity = itemView.findViewById(id.category_items_quantity);
            this.catPrice = itemView.findViewById(id.category_items_unit_price);
        }
    }
}