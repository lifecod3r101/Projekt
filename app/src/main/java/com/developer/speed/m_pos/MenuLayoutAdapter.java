package com.developer.speed.m_pos;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;


public class MenuLayoutAdapter extends RecyclerView.Adapter<MenuLayoutAdapter.MenuViewHolder>
{
    private Context menuContext;
    private List<MenuLayoutCardProperty>myMenuInformation;
    public MenuLayoutAdapter(Context menuContext,List<MenuLayoutCardProperty>myMenuInformation)
    {
        this.menuContext=menuContext;
        this.myMenuInformation=myMenuInformation;
    }


    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater menuInflater=LayoutInflater.from(menuContext);
        View view=menuInflater.inflate(R.layout.menu_layout_cards,null);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position)
    {
        MenuLayoutCardProperty property=myMenuInformation.get(position);
        holder.menuText.setText(property.getMenuItem());
        holder.menuCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount()
    {
        return myMenuInformation.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder
    {
        TextView menuText;
        CardView menuCard;
        public MenuViewHolder(View itemView)
        {
            super(itemView);
            menuText=itemView.findViewById(R.id.menu_card_information);
            menuCard=itemView.findViewById(R.id.menu_card);
        }
    }


}
