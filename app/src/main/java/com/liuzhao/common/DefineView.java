package com.liuzhao.common;

/**
 * Created by Administrator on 2月05日0005.
 */

public interface DefineView {
    public void initView();  //初始化界面元素
    public void initValidata();  //初始化变量
    public void initListener();  //初始化监听器
    public void bindData();       //绑定数据
}
