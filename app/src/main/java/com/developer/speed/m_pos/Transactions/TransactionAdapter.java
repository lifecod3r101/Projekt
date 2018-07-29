package com.developer.speed.m_pos.Transactions;

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

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder> {
    private final Context transactionContext;
    private final List<TransactionProperties> transactionList;

    public TransactionAdapter(Context transactionContext, List<TransactionProperties> transactionList)
    {
        this.transactionContext = transactionContext;
        this.transactionList = transactionList;
    }

    @NonNull
    @Override
    public TransactionAdapter.TransactionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater transactInflate = LayoutInflater.from(transactionContext);
        View view = transactInflate.inflate(layout.transaction_card_layout, null);
        return new TransactionAdapter.TransactionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionAdapter.TransactionViewHolder holder, int position)
    {
        TransactionProperties transactProperties = transactionList.get(position);
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

    public class TransactionViewHolder extends ViewHolder
    {
        TextView transactCode,transactDate,transactCost;
        CardView transactCard;

        public TransactionViewHolder(View itemView) {
            super(itemView);
            transactCode = itemView.findViewById(id.transaction_code);
            transactDate = itemView.findViewById(id.trasaction_date);
            transactCost = itemView.findViewById(id.transaction_cost);
        }
    }

}

