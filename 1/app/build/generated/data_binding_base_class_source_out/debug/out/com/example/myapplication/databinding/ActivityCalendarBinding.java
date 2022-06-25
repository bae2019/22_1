// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCalendarBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView calendarImageView1;

  @NonNull
  public final ImageView calendarImageView10;

  @NonNull
  public final ImageView calendarImageView11;

  @NonNull
  public final ImageView calendarImageView12;

  @NonNull
  public final ImageView calendarImageView2;

  @NonNull
  public final ImageView calendarImageView3;

  @NonNull
  public final ImageView calendarImageView4;

  @NonNull
  public final ImageView calendarImageView5;

  @NonNull
  public final ImageView calendarImageView6;

  @NonNull
  public final ImageView calendarImageView7;

  @NonNull
  public final ImageView calendarImageView8;

  @NonNull
  public final ImageView calendarImageView9;

  @NonNull
  public final ToolbarBinding include;

  @NonNull
  public final TextView textView;

  private ActivityCalendarBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView calendarImageView1, @NonNull ImageView calendarImageView10,
      @NonNull ImageView calendarImageView11, @NonNull ImageView calendarImageView12,
      @NonNull ImageView calendarImageView2, @NonNull ImageView calendarImageView3,
      @NonNull ImageView calendarImageView4, @NonNull ImageView calendarImageView5,
      @NonNull ImageView calendarImageView6, @NonNull ImageView calendarImageView7,
      @NonNull ImageView calendarImageView8, @NonNull ImageView calendarImageView9,
      @NonNull ToolbarBinding include, @NonNull TextView textView) {
    this.rootView = rootView;
    this.calendarImageView1 = calendarImageView1;
    this.calendarImageView10 = calendarImageView10;
    this.calendarImageView11 = calendarImageView11;
    this.calendarImageView12 = calendarImageView12;
    this.calendarImageView2 = calendarImageView2;
    this.calendarImageView3 = calendarImageView3;
    this.calendarImageView4 = calendarImageView4;
    this.calendarImageView5 = calendarImageView5;
    this.calendarImageView6 = calendarImageView6;
    this.calendarImageView7 = calendarImageView7;
    this.calendarImageView8 = calendarImageView8;
    this.calendarImageView9 = calendarImageView9;
    this.include = include;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCalendarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCalendarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_calendar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCalendarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.calendar_imageView1;
      ImageView calendarImageView1 = ViewBindings.findChildViewById(rootView, id);
      if (calendarImageView1 == null) {
        break missingId;
      }

      id = R.id.calendar_imageView10;
      ImageView calendarImageView10 = ViewBindings.findChildViewById(rootView, id);
      if (calendarImageView10 == null) {
        break missingId;
      }

      id = R.id.calendar_imageView11;
      ImageView calendarImageView11 = ViewBindings.findChildViewById(rootView, id);
      if (calendarImageView11 == null) {
        break missingId;
      }

      id = R.id.calendar_imageView12;
      ImageView calendarImageView12 = ViewBindings.findChildViewById(rootView, id);
      if (calendarImageView12 == null) {
        break missingId;
      }

      id = R.id.calendar_imageView2;
      ImageView calendarImageView2 = ViewBindings.findChildViewById(rootView, id);
      if (calendarImageView2 == null) {
        break missingId;
      }

      id = R.id.calendar_imageView3;
      ImageView calendarImageView3 = ViewBindings.findChildViewById(rootView, id);
      if (calendarImageView3 == null) {
        break missingId;
      }

      id = R.id.calendar_imageView4;
      ImageView calendarImageView4 = ViewBindings.findChildViewById(rootView, id);
      if (calendarImageView4 == null) {
        break missingId;
      }

      id = R.id.calendar_imageView5;
      ImageView calendarImageView5 = ViewBindings.findChildViewById(rootView, id);
      if (calendarImageView5 == null) {
        break missingId;
      }

      id = R.id.calendar_imageView6;
      ImageView calendarImageView6 = ViewBindings.findChildViewById(rootView, id);
      if (calendarImageView6 == null) {
        break missingId;
      }

      id = R.id.calendar_imageView7;
      ImageView calendarImageView7 = ViewBindings.findChildViewById(rootView, id);
      if (calendarImageView7 == null) {
        break missingId;
      }

      id = R.id.calendar_imageView8;
      ImageView calendarImageView8 = ViewBindings.findChildViewById(rootView, id);
      if (calendarImageView8 == null) {
        break missingId;
      }

      id = R.id.calendar_imageView9;
      ImageView calendarImageView9 = ViewBindings.findChildViewById(rootView, id);
      if (calendarImageView9 == null) {
        break missingId;
      }

      id = R.id.include;
      View include = ViewBindings.findChildViewById(rootView, id);
      if (include == null) {
        break missingId;
      }
      ToolbarBinding binding_include = ToolbarBinding.bind(include);

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityCalendarBinding((ConstraintLayout) rootView, calendarImageView1,
          calendarImageView10, calendarImageView11, calendarImageView12, calendarImageView2,
          calendarImageView3, calendarImageView4, calendarImageView5, calendarImageView6,
          calendarImageView7, calendarImageView8, calendarImageView9, binding_include, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
