package com.aiceking.view_load_retry.loadretryadapter.foractivity;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

import com.aiceking.view_load_retry.R;
import com.aiceking.viewloadretrylibrary.adapter.BaseLoadRetryAdapter;
import com.jaywei.mdprogress.CircularProgressBar;

public class LoadAdapterForActivity extends BaseLoadRetryAdapter{
    @Override
    public void onLoadStart(View view) {
        ((TextView)view.findViewById(R.id.tv_text)).setText("加载中 ...");
    }
    @Override
    public void onFalied(View view, Object object) {
    }
/**这里在加载完成的时候做了一个淡出动画*/
    @Override
    public void onSuccess(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1,0);
        alphaAnimation.setDuration(500);
        view.startAnimation(alphaAnimation);
        view.setVisibility(View.GONE);
    }

    @Override
    public int getCoverViewLayoutId() {
        return R.layout.load_activity;
    }
}
