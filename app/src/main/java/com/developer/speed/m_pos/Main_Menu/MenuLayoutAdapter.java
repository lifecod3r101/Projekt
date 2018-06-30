package com.developer.speed.m_pos.Main_Menu;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.developer.speed.m_pos.Main_Menu.MenuLayoutAdapter.MenuViewHolder;
import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;

import java.util.List;


public class MenuLayoutAdapter extends RecyclerView.Adapter<MenuViewHolder> {
    private final Context menuContext;
    private final List<MenuLayoutCardProperty> myMenuInformation;
    public MenuLayoutAdapter(Context menuContext,List<MenuLayoutCardProperty>myMenuInformation)
    {
        this.menuContext=menuContext;
        this.myMenuInformation=myMenuInformation;
    }
    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater menuInflater = LayoutInflater.from(this.menuContext);
        View view = menuInflater.inflate(layout.menu_layout_cards, null);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position)
    {
        MenuLayoutCardProperty property = this.myMenuInformation.get(position);
        holder.menuText.setText(property.getMenuItem());
    }

    @Override
    public int getItemCount()
    {
        return this.myMenuInformation.size();
    }


    public class MenuViewHolder extends ViewHolder
    {
        TextView menuText;
        CardView menuCard;
        public MenuViewHolder(View itemView)
        {
            super(itemView);
            this.menuText = itemView.findViewById(id.menu_card_information);
            this.menuCard = itemView.findViewById(id.menu_card);
        }

    }
}
