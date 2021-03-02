package com.dana.watermelon_auth;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context ctx) {
        this.context = context;
    }

    public int[] slideImages = {
            R.drawable.bg_watermelon,
            R.drawable.bg_coconut,
            R.drawable.bg_kiwi
    };
    public String[] slide_headings = {
            "Арбуз",
            "Кокос",
            "Киви"
    };

    public String[] slide_description = {
            "Чтобы выбрать сладкий арбуз, нужно следовать нескольким простым правилам. Стучать – звук у спелого арбуза должен быть звонкий, не глухой. Хвостик должен быть сухой, не зеленый.",
            "В процессе роста кокосовая пальма потребляет много соли, поэтому растут эти деревья преимущественно возле морского или океанского побережья.",
            "Интересно, что в киви содержится витамина С больше, чем в цитрусовых. Высокое содержание калия делает киви полезным при некоторых формах гипертонии, дефиците йода."
    };


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View v = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = v.findViewById(R.id.imageView);
        TextView slideHeading = v.findViewById(R.id.sliderTitle);
        TextView slideDescription = v.findViewById(R.id.sliderDesc);

        slideImageView.setImageResource(slideImages[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_description[position]);

        container.addView(v);
        return v;


    }
}
