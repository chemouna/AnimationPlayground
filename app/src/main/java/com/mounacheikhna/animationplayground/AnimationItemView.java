package com.mounacheikhna.animationplayground;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * @author cheikhnamouna.
 */
public class AnimationItemView extends CardView {

  @Bind(R.id.animation_tite) TextView animationTitle;

  public AnimationItemView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public void bindTo(AnimationItem animationItem) {
    animationTitle.setText(animationItem.title);
  }

  @Override protected void onFinishInflate() {
    super.onFinishInflate();
    ButterKnife.bind(this);
  }
}
