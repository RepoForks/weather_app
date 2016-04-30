package com.mirhoseini.weatherapp.utils;

import com.mirhoseini.weatherapp.core.utils.IScheduler;

import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Mohsen on 30/04/16.
 */
public class AppScheduler implements IScheduler {

    @Override
    public Scheduler mainThread() {
        return AndroidSchedulers.mainThread();
    }

    @Override
    public Scheduler backgroundThread() {
        return Schedulers.io();
    }
}