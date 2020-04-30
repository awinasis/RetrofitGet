package com.example.retrofitawinasis.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitawinasis.Post;
import com.example.retrofitawinasis.R;
import java.util.List;

public class SiswaAdapter extends RecyclerView.Adapter<SiswaAdapter.ViewHolder> {

    private List<Post> items;

    public SiswaAdapter(List<Post> items) {
        this.items = items;
    }
    @NonNull
    @Override
    public SiswaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_siswa, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Post item = items.get(position);

        holder.TextId.setText(item.getId_siswa());
        holder.TextNama.setText(item.getNama());
        holder.TextAlamat.setText(item.getAlamat());
        holder.TextJK.setText(item.getJenis_kelamin());
        holder.TextNo.setText(item.getNo_telp());
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView TextId, TextNama, TextAlamat, TextJK, TextNo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            TextId = (TextView) itemView.findViewById(R.id.id_siswa);
            TextNama = (TextView) itemView.findViewById(R.id.txt_nama);
            TextAlamat = (TextView) itemView.findViewById(R.id.txt_alamat);
            TextJK = (TextView) itemView.findViewById(R.id.txt_jk);
            TextNo = (TextView) itemView.findViewById(R.id.txt_no_telp);
        }
    }
}