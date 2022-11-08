package com.wtiinfo.adapters2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class ProductsAdapter extends BaseAdapter {

    private List<Product> products;
    private LayoutInflater layoutInflater;

    //utilitario
    private static final NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    public ProductsAdapter(Context context, List<Product> products) {
        this.products = products;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return products.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        ProductViewHolder vh;

        //se null, estara sendo criada, inflada a view,
        // caso contraio sera reaproveitada, por ja possuir um viewHolder
        if (view == null) {

            view = layoutInflater.inflate(R.layout.adapter_produtos, parent, false);

            vh = new ProductViewHolder();
            vh.txtName = view.findViewById(R.id.txtname);
            vh.txtPrice = view.findViewById(R.id.txtprice);
            view.setTag(vh); //atrelhando o viewholder a view

        } else {
            vh = (ProductViewHolder) view.getTag();
        }

        Product product = products.get(position);

        vh.txtName.setText(product.getName());
        vh.txtPrice.setText(nf.format(product.getPrice()));

        return view;
    }

    private static class ProductViewHolder {
        public TextView txtName;
        public TextView txtPrice;
    }
}
