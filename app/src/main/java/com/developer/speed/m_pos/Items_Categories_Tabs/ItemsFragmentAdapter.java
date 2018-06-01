package com.developer.speed.m_pos.Items_Categories_Tabs;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.developer.speed.m_pos.Items_Categories_Tabs.ItemsFragmentAdapter.ItemsAvailableViewHolder;
import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;

import java.util.List;

public class ItemsFragmentAdapter extends Adapter<ItemsAvailableViewHolder> {

    private final List<ItemsFragmentProperties> itemsDesc;

    public ItemsFragmentAdapter(List<ItemsFragmentProperties> itemsDesc) {
        this.itemsDesc = itemsDesc;
    }

    @NonNull
    @Override
    public ItemsAvailableViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater itemsAvailableInflater = LayoutInflater.from(parent.getContext());
        View itemsAvailableView = itemsAvailableInflater.inflate(layout.item_tab_layout, parent, false);
        return new ItemsAvailableViewHolder(itemsAvailableView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsAvailableViewHolder holder, int position) {
        ItemsFragmentProperties myItemsAvailableProperty = this.itemsDesc.get(position);
        holder.itemsAvailableCode.setText(myItemsAvailableProperty.getItemAvailableCode());
        holder.itemsAvailableName.setText(myItemsAvailableProperty.getItemAvailableName());
        holder.itemsAvailableQuantity.setText(String.valueOf(myItemsAvailableProperty.getItemAvailableQuantity()));
        holder.itemsAvailablePrice.setText(String.valueOf(myItemsAvailableProperty.getItemAvailablePrice()));
        holder.itemsAvailableCategory.setText(myItemsAvailableProperty.getItemAvailableCategory());
        holder.itemAvailableCard.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return this.itemsDesc.size();
    }

    public class ItemsAvailableViewHolder extends ViewHolder {
        CardView itemAvailableCard;
        TextView itemsAvailableCode, itemsAvailableName, itemsAvailableQuantity, itemsAvailablePrice, itemsAvailableCategory;

        public ItemsAvailableViewHolder(View itemView) {
            super(itemView);
            this.itemAvailableCard = itemView.findViewById(id.item_available_card);
            this.itemsAvailableCode = itemView.findViewById(id.item_available_code);
            this.itemsAvailableName = itemView.findViewById(id.item_available_name);
            this.itemsAvailableQuantity = itemView.findViewById(id.item_available_quantity);
            this.itemsAvailablePrice = itemView.findViewById(id.item_available_unit_price);
            this.itemsAvailableCategory = itemView.findViewById(id.item_available_category);
        }
    }
}
