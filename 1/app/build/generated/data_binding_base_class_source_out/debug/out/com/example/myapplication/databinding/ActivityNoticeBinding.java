// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNoticeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ToolbarBinding include;

  @NonNull
  public final LinearLayout linearLayout5;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final SearchView searchNotice;

  @NonNull
  public final TextView textView;

  private ActivityNoticeBinding(@NonNull ConstraintLayout rootView, @NonNull ToolbarBinding include,
      @NonNull LinearLayout linearLayout5, @NonNull RecyclerView recyclerView,
      @NonNull SearchView searchNotice, @NonNull TextView textView) {
    this.rootView = rootView;
    this.include = include;
    this.linearLayout5 = linearLayout5;
    this.recyclerView = recyclerView;
    this.searchNotice = searchNotice;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNoticeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNoticeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_notice, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNoticeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.include;
      View include = ViewBindings.findChildViewById(rootView, id);
      if (include == null) {
        break missingId;
      }
      ToolbarBinding binding_include = ToolbarBinding.bind(include);

      id = R.id.linearLayout5;
      LinearLayout linearLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout5 == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.search_notice;
      SearchView searchNotice = ViewBindings.findChildViewById(rootView, id);
      if (searchNotice == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityNoticeBinding((ConstraintLayout) rootView, binding_include, linearLayout5,
          recyclerView, searchNotice, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
