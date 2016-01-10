package com.mounacheikhna.animationplayground;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mounacheikhna.animationplayground.AnimationItem.Animations;
import java.util.Arrays;
import java.util.List;

public class PlaygroundAdapter extends RecyclerView.Adapter<PlaygroundAdapter.PlaygroundViewHolder> {

  private final AnimationItem[] ITEMS = new AnimationItem[] {
      new AnimationItem("Shared elements transitions", Animations.SHARED_ELEMENT_TRANSITION)
  };

  private List<AnimationItem> items;

  public PlaygroundAdapter() {
    this.items = Arrays.asList(ITEMS);
  }

  @Override public PlaygroundViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    final AnimationItemView view = (AnimationItemView) LayoutInflater.from(parent.getContext())
        .inflate(R.layout.playground_item, parent, false);
    return new PlaygroundViewHolder(view);
  }

  @Override public void onBindViewHolder(final PlaygroundViewHolder holder, int position) {
    final AnimationItem item = items.get(position);
    holder.itemView.bindTo(item);
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
    AnimationItemView itemView;

    public PlaygroundViewHolder(AnimationItemView itemView) {
      super(itemView);
      this.itemView = itemView;
    }
  }

}