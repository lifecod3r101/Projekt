package com.developer.speed.m_pos.Debt_Items;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;

import java.util.List;

public class DebtRecordItemAdapter extends RecyclerView.Adapter<DebtRecordItemAdapter.DebtRecordItemViewHolder> {
    private final Context debtRecordItemContext;
    private final List<DebtRecordItemProperty> mydebtRecordItem;
    public DebtRecordItemAdapter(Context debtRecordItemContext, List<DebtRecordItemProperty> mydebtRecordItem)
    {
        this.debtRecordItemContext=debtRecordItemContext;
        this.mydebtRecordItem=mydebtRecordItem;
    }

    @NonNull
    @Override
    public DebtRecordItemAdapter.DebtRecordItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater debtRecordItemInflater = LayoutInflater.from(debtRecordItemContext);
        View view = debtRecordItemInflater.inflate(layout.debt_item_recycler_layout, null);
        return new DebtRecordItemAdapter.DebtRecordItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DebtRecordItemAdapter.DebtRecordItemViewHolder holder, int position)
    {
        DebtRecordItemProperty myDebtRecordItemProperty = mydebtRecordItem.get(position);
        holder.debtRecordItemCode.setText(myDebtRecordItemProperty.getDebtRecordItemCode());
        holder.debtRecordItemName.setText(myDebtRecordItemProperty.getDebtRecordItemName());
        holder.debtRecordItemQuantity.setText(Integer.toString(myDebtRecordItemProperty.getDebtRecordItemQuantity()));
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

    public class DebtRecordItemViewHolder extends ViewHolder {
        TextView debtRecordItemCode, debtRecordItemName, debtRecordItemQuantity, debtRecordItemPrice;
        CardView debtRecordCard;

        public DebtRecordItemViewHolder(View itemView) {
            super(itemView);
            debtRecordItemCode = itemView.findViewById(id.debt_record_item_code);
            debtRecordItemName = itemView.findViewById(id.debt_record_item_name);
            debtRecordItemQuantity = itemView.findViewById(id.debt_record_item_quantity);
            debtRecordItemPrice = itemView.findViewById(id.debt_record_item_total_price);
            debtRecordCard = itemView.findViewById(id.debt_record_item_card);
        }
    }
}
