package com.ljr.shoppingmall.user;

import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.ljr.shoppingmall.R;
import com.ljr.shoppingmall.base.BaseFragment;

/**
 * Created by LinJiaRong on 2017/5/10.
 * TODO：首页
 */

public class UserFragment extends BaseFragment {
    private static final String TAG = UserFragment.class.getSimpleName();

    @Override
    public View initView() {
        Log.e(TAG, "主页视图被初始化了");
        View view = View.inflate(mContext, R.layout.fragment_user, null);
        return view;
    }

    @Override
    public void initData() {
        Log.e(TAG, "initData:主页数据被初始化了 ");

    }
}
