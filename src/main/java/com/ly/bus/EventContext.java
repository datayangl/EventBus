package com.ly.bus;

import java.lang.reflect.Method;

public interface EventContext {
    String getSource();

    Object getSubscriber();

    Method getSubscribe();

    Object getEvent();
}
