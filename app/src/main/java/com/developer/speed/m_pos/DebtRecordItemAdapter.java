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

public class DebtRecordItemAdapter extends RecyclerView.Adapter<DebtRecordItemAdapter.DebtRecordItemViewHolder>
{
    private Context debtRecordItemContext;
    private List<DebtRecordItemProperty> mydebtRecordItem;
    public DebtRecordItemAdapter(Context debtRecordItemContext, List<DebtRecordItemProperty> mydebtRecordItem)
    {
        this.debtRecordItemContext=debtRecordItemContext;
        this.mydebtRecordItem=mydebtRecordItem;
    }
    public class DebtRecordItemViewHolder extends RecyclerView.ViewHolder
    {
        TextView debtRecordItemCode,debtRecordItemName,debtRecordItemQuantity,debtRecordItemPrice;
        CardView debtRecordCard;
        public DebtRecordItemViewHolder(View itemView)
        {
            super(itemView);
            debtRecordItemCode=itemView.findViewById(R.id.debt_record_item_code);
            debtRecordItemName=itemView.findViewById(R.id.debt_record_item_name);
            debtRecordItemQuantity=itemView.findViewById(R.id.debt_record_item_quantity);
            debtRecordItemPrice=itemView.findViewById(R.id.debt_record_item_total_price);
            debtRecordCard=itemView.findViewById(R.id.debt_record_item_card);
        }
    }

    @NonNull
    @Override
    public DebtRecordItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater debtRecordItemInflater=LayoutInflater.from(debtRecordItemContext);
        View view=debtRecordItemInflater.inflate(R.layout.debt_item_recycler_layout,null);
        return new DebtRecordItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DebtRecordItemViewHolder holder, int position)
    {
        DebtRecordItemProperty myDebtRecordItemProperty=mydebtRecordItem.get(position);
        holder.debtRecordItemCode.setText(myDebtRecordItemProperty.getDebtRecordItemCode());
        holder.debtRecordItemName.setText(myDebtRecordItemProperty.getDebtRecordItemName());
        holder.debtRecordItemQuantity.setText(Double.toString(myDebtRecordItemProperty.getDebtRecordItemQuantity()));
        holder.debtRecordItemPrice.setText(Double.toString(myDebtRecordItemProperty.getDebtRecordItemPrice()));
        holder.debtRecordCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

            }
        });
    }


    @Override
    public int getItemCount()
    {
        return mydebtRecordItem.size();
    }
}
