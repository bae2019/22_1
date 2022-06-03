// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemLabBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView itemLab1;

  @NonNull
  public final TextView itemLab2;

  @NonNull
  public final TextView itemLab3;

  @NonNull
  public final TextView itemLab4;

  private ItemLabBinding(@NonNull LinearLayout rootView, @NonNull TextView itemLab1,
      @NonNull TextView itemLab2, @NonNull TextView itemLab3, @NonNull TextView itemLab4) {
    this.rootView = rootView;
    this.itemLab1 = itemLab1;
    this.itemLab2 = itemLab2;
    this.itemLab3 = itemLab3;
    this.itemLab4 = itemLab4;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemLabBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemLabBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_lab, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemLabBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.item_lab1;
      TextView itemLab1 = ViewBindings.findChildViewById(rootView, id);
      if (itemLab1 == null) {
        break missingId;
      }

      id = R.id.item_lab2;
      TextView itemLab2 = ViewBindings.findChildViewById(rootView, id);
      if (itemLab2 == null) {
        break missingId;
      }

      id = R.id.item_lab3;
      TextView itemLab3 = ViewBindings.findChildViewById(rootView, id);
      if (itemLab3 == null) {
        break missingId;
      }

      id = R.id.item_lab4;
      TextView itemLab4 = ViewBindings.findChildViewById(rootView, id);
      if (itemLab4 == null) {
        break missingId;
      }

      return new ItemLabBinding((LinearLayout) rootView, itemLab1, itemLab2, itemLab3, itemLab4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}