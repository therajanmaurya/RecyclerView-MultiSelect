package opensource.recyclerview.mutiselect.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import opensource.recyclerview.mutiselect.R;
import opensource.recyclerview.mutiselect.model.Item;

/**
 * Created by Rajan Maurya on 08/01/17.
 */
public class Adapter extends SelectableAdapter<Adapter.ViewHolder> {

    private List<Item> mItemList;
    private Context context;

    public Adapter() {
        mItemList = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recycler_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item item = mItemList.get(position);

        holder.tv_title.setText(item.getTitle());
        holder.tv_subtitle.setText(item.getSubTitle());

        holder.ll_card.setBackgroundColor(isSelected(position) ?
                ContextCompat.getColor(context,R.color.selected_overlay) :
                ContextCompat.getColor(context, android.R.color.transparent));
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }

    public void setItems(List<Item> items) {
        mItemList = items;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
            implements View.OnLongClickListener {

        @BindView(R.id.title)
        TextView tv_title;

        @BindView(R.id.subtitle)
        TextView tv_subtitle;

        @BindView(R.id.ll_card)
        LinearLayout ll_card;

        public ViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
            v.setOnLongClickListener(this);
        }

        @Override
        public boolean onLongClick(View view) {

            return false;
        }
    }
}