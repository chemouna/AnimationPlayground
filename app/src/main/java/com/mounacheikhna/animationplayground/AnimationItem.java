package com.mounacheikhna.animationplayground;

/**
 * @author cheikhnamouna.
 */
public class AnimationItem {
  String title;
  Animations type;

  enum Animations {
    SHARED_ELEMENT_TRANSITION
  }

  public AnimationItem(String title, Animations type) {
    this.title = title;
    this.type = type;
  }

}
