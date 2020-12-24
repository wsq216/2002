package com.example.shopping_android_app.interfaces.shop;


import com.example.shopping_android_app.interfaces.Callback;
import com.example.shopping_android_app.interfaces.IBaseModel;
import com.example.shopping_android_app.interfaces.IBasePresenter;
import com.example.shopping_android_app.interfaces.IBaseView;
import com.example.shopping_android_app.model.home.shop.CarBean;
import com.example.shopping_android_app.model.home.shop.DeleteCarBean;
import com.example.shopping_android_app.model.home.shop.UpdateCarBean;

import java.util.Map;

public interface ICar {
    interface View extends IBaseView {
        void getCarListReturn(CarBean carBean);

        //更新 购物车
        void updateCarReturn(UpdateCarBean result);

        //删除购物车
        void deleteCarReturn(DeleteCarBean result);
    }

    interface Presenter extends IBasePresenter<View> {
        void getCarList();

        //更新购物车的数据
        void  updateCar(Map<String,String> map);

        //删除购物车列表
        void deleteCar(String pIds);
    }


    interface Model extends IBaseModel {
        void getCarList(Callback callback);

        void updateCar(Map<String,String> map,Callback callback);

        void deleteCar(String pIds,Callback callback);
    }

}
