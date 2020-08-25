package com.example.popularmovies;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

public class BindingUtils {
    /**
     * Utility method for Image url If image url is valid then it is parsed else
     * placeholder image is shown. Use radius=80 for round image
     *
     * @param imageView Default view passed for displaying image
     * @param url       Url of the image
     */
    @BindingAdapter(value = {"url"})
    public static void loadThumbnailImage(ImageView imageView, String url) {
        Context context = imageView.getContext();
        // Setup Placeholder
        Drawable drawablePlaceholder = context.getDrawable(R.drawable.ic_whatshot_black_24dp);

        // Load Image or Placeholder
        Glide.with(imageView)
                .load(url)
                .placeholder(drawablePlaceholder)
                .into(imageView);
    }
}
