package com.developer.speed.m_pos.Transactions;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;
import com.developer.speed.m_pos.Transactions.TransactionAdapter.TransactionViewHolder;

import java.util.List;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionViewHolder> {
    private final Context transactionContext;
    private final List<TransactionProperties> transactionList;

    public TransactionAdapter(Context transactionContext, List<TransactionProperties> transactionList)
    {
        this.transactionContext = transactionContext;
        this.transactionList = transactionList;
    }

    @NonNull
    @Override
    public TransactionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater transactInflate = LayoutInflater.from(this.transactionContext);
        View view = transactInflate.inflate(layout.transaction_card_layout, null);
        return new TransactionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionViewHolder holder, int position)
    {
        TransactionProperties transactProperties = this.transactionList.get(position);
        holder.transactCode.setText(transactProperties.getTransactionCode());
        holder.transactDate.setText(String.valueOf(transactProperties.getTransactionDate()));
        holder.transactCost.setText(Double.toString(transactProperties.getTransactionCost()));
        holder.transactCard.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return this.transactionList.size();
    }

    public class TransactionViewHolder extends ViewHolder
    {
        TextView transactCode,transactDate,transactCost;
        CardView transactCard;

        public TransactionViewHolder(View itemView) {
            super(itemView);
            this.transactCode = itemView.findViewById(id.transaction_code);
            this.transactDate = itemView.findViewById(id.trasaction_date);
            this.transactCost = itemView.findViewById(id.transaction_cost);
        }
    }

}

