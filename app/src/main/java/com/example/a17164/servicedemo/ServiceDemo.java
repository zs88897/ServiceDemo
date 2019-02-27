package com.example.a17164.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class ServiceDemo extends Service {
    int mStartMode;//标记服务被杀死后的行为

    IBinder mBinder;//绑定的客户端接口

    boolean mAllowRebind;//标识是否可以使用onRebind
    @Override
    public void onCreate(){//创建服务时调用
        Toast.makeText(this,"服务被创建",Toast.LENGTH_LONG).show();
    }
    /** 调用startService()启动服务时回调 */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        Toast.makeText(this,"服务已经启动",Toast.LENGTH_LONG).show();
        return START_STICKY;
    }
    /** 通过bindService()绑定到服务的客户端 */
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    /** 通过unbindService()解除所有客户端绑定时调用 */
    @Override
    public boolean onUnbind(Intent intent) {
        return mAllowRebind;
    }
    /** 通过bindService()将客户端绑定到服务时调用*/
    @Override
    public void onRebind(Intent intent) {

    }
    @Override
    public void onDestroy() {
Toast.makeText(this,"服务已经停止",Toast.LENGTH_LONG).show();
    }
}
