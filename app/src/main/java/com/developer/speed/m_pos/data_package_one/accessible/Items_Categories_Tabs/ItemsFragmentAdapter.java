package com.developer.speed.m_pos.data_package_one.accessible.Items_Categories_Tabs;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.developer.speed.m_pos.R;

import java.util.List;

public class ItemsFragmentAdapter extends Adapter<ItemsFragmentAdapter.ItemsAvailableViewHolder> {

    private final List<ItemsFragmentProperties> itemsDesc;

    public ItemsFragmentAdapter(List<ItemsFragmentProperties> itemsDesc) {
        this.itemsDesc = itemsDesc;
    }

    @NonNull
    @Override
    public ItemsFragmentAdapter.ItemsAvailableViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater itemsAvailableInflater = LayoutInflater.from(parent.getContext());
        View itemsAvailableView = itemsAvailableInflater.inflate(R.layout.item_tab_layout, parent, false);
        return new ItemsFragmentAdapter.ItemsAvailableViewHolder(itemsAvailableView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsFragmentAdapter.ItemsAvailableViewHolder holder, int position) {
        ItemsFragmentProperties myItemsAvailableProperty = itemsDesc.get(position);
        holder.itemsAvailableCode.setText(myItemsAvailableProperty.getItemAvailableCode());
        holder.itemsAvailableName.setText(myItemsAvailableProperty.getItemAvailableName());
        holder.itemsAvailableQuantity.setText(String.valueOf(myItemsAvailableProperty.getItemAvailableQuantity()));
        holder.itemsAvailablePrice.setText(String.valueOf(myItemsAvailableProperty.getItemAvailablePrice()));
        holder.itemsAvailableCategory.setText(myItemsAvailableProperty.getItemAvailableCategory());
        holder.itemAvailableCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return itemsDesc.size();
    }

    public class ItemsAvailableViewHolder extends RecyclerView.ViewHolder {
        CardView itemAvailableCard;
        TextView itemsAvailableCode, itemsAvailableName, itemsAvailableQuantity, itemsAvailablePrice, itemsAvailableCategory;

        public ItemsAvailableViewHolder(View itemView) {
            super(itemView);
            itemAvailableCard = itemView.findViewById(R.id.item_available_card);
            itemsAvailableCode = itemView.findViewById(R.id.item_available_code);
            itemsAvailableName = itemView.findViewById(R.id.item_available_name);
            itemsAvailableQuantity = itemView.findViewById(R.id.item_available_quantity);
            itemsAvailablePrice = itemView.findViewById(R.id.item_available_unit_price);
            itemsAvailableCategory = itemView.findViewById(R.id.item_available_category);
        }
    }
}
