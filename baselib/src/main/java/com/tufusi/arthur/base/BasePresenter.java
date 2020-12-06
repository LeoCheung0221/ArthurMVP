package com.tufusi.arthur.base;

/**
 * Created by LeoCheung on 2020/12/6.
 *
 * @description presenter基类
 */
public interface BasePresenter {
    /**
     * 生命周期创建
     */
    void create();

    /**
     * 生命周期结束
     */
    void destroy();
}
