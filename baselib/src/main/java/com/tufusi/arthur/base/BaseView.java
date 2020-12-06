package com.tufusi.arthur.base;

/**
 * Created by LeoCheung on 2020/12/6.
 *
 * @description View基类
 * 这个接口不会很复杂，只需要声明View的通用功能即可
 */
public interface BaseView<T extends BasePresenter> {
    /**
     * 注入 展示层接口
     *
     * @param presenter 展示层，实际生产中由Activity构造，涉及Fragment或者View均由此传入，当然也可以另外管理一套
     */
    void injectPresenter(T presenter);
}
