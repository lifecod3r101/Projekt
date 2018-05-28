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

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder>
{
    private Context transactionContext;
    private List<TransactionProperties> transactionList;

    public TransactionAdapter(Context transactionContext, List<TransactionProperties> transactionList)
    {
        this.transactionContext = transactionContext;
        this.transactionList = transactionList;
    }

    @NonNull
    @Override
    public TransactionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater transactInflate=LayoutInflater.from(transactionContext);
        View view=transactInflate.inflate(R.layout.transaction_card_layout,null);
        return new TransactionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionViewHolder holder, int position)
    {
        TransactionProperties transactProperties=transactionList.get(position);
        holder.transactCode.setText(transactProperties.getTransactionCode());
        holder.transactDate.setText(String.valueOf(transactProperties.getTransactionDate()));
        holder.transactCost.setText(Double.toString(transactProperties.getTransactionCost()));
        holder.transactCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return transactionList.size();
    }

    public class TransactionViewHolder extends RecyclerView.ViewHolder
    {
        TextView transactCode,transactDate,transactCost;
        CardView transactCard;

        public TransactionViewHolder(View itemView) {
            super(itemView);
            transactCode=itemView.findViewById(R.id.transaction_code);
            transactDate=itemView.findViewById(R.id.trasaction_date);
            transactCost=itemView.findViewById(R.id.transaction_cost);
        }
    }

}

