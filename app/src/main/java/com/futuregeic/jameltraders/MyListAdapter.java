package com.futuregeic.jameltraders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;


 //
    public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>
    {
        private MyListData[] listdata;

        // RecyclerView recyclerView;
        public MyListAdapter(MyListData[] listdata) {
            this.listdata = listdata;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View listItem = layoutInflater.inflate(R.layout.cardview, parent, false);
            ViewHolder viewHolder = new ViewHolder(listItem);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            final MyListData myListData = listdata[position];
            holder.textView.setText(listdata[position].getDescription());
            holder.imageView.setImageResource(listdata[position].getImgId());
            holder.linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   // Toast.makeText(view.getContext(), "click on item: " + myListData.getDescription(), Toast.LENGTH_LONG).show();
                    Toast.makeText(view.getContext(),"click on itm "+ myListData.getDescription(),Toast.LENGTH_SHORT);
                }
            });
        }


        @Override
        public int getItemCount() {
            return listdata.length;
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public ImageView imageView;
            public TextView textView;
            public LinearLayout linearLayout;

            public ViewHolder(View itemView) {
                super(itemView);
                this.imageView = (ImageView) itemView.findViewById(R.id.imageView2);
                this.textView = (TextView) itemView.findViewById(R.id.caption);
                linearLayout =  itemView.findViewById(R.id.linear);
            }
        }
    }


