package com.mounacheikhna.animationplayground;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import java.util.Arrays;
import java.util.List;

public class PlaygroundAdapter extends RecyclerView.Adapter<PlaygroundAdapter.PlaygroundViewHolder> {

  private final Item[] ITEMS = new Item[] {
      new Item("Shared elements transitions", Animations.SHARED_ELEMENT_TRANSITION)
  };

  private List<Item> items;

  public PlaygroundAdapter() {
    this.items = Arrays.asList(ITEMS);
  }

  @Override public PlaygroundViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    return LayoutInflater.from(parent.getContext())
        .inflate(R.layout.playground_item, parent, false);
  }

  @Override public void onBindViewHolder(final PlaygroundViewHolder holder, int position) {
    final Item item = items.get(position);
    holder.text.setText(item.title);
    holder.itemView.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        switch (item.type) {
          case SHARED_ELEMENT_TRANSITION:
            //startActivity()

        }
      }
    });
  }

  @Override public int getItemCount() {
    return items.size();
  }

  public static class PlaygroundViewHolder extends RecyclerView.ViewHolder {
    @Bind(R.id.txt) TextView text;

    public PlaygroundViewHolder(View itemView) {
      super(itemView);
      ButterKnife.bind(this, itemView);
    }
  }

  enum Animations {
    SHARED_ELEMENT_TRANSITION
  }


  public class Item {
    String title;
    Animations type;

    public Item(String title, Animations type) {
      this.title = title;
      this.type = type;
    }
  }

}