package com.amazmod.service;

import android.view.accessibility.AccessibilityEvent;
import android.accessibilityservice.AccessibilityService;

public class AmazModAccessibilityService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {

    }

    @Override
    public void onInterrupt() {

    }

    public void performBack() {
        performGlobalAction(AccessibilityService.GLOBAL_ACTION_BACK);
    }

}
