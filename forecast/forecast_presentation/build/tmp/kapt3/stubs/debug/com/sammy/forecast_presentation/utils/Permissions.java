package com.sammy.forecast_presentation.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/sammy/forecast_presentation/utils/Permissions;", "", "()V", "hasLocationPermission", "", "context", "Landroid/content/Context;", "requestLocationPermission", "", "fragment", "Landroidx/fragment/app/Fragment;", "forecast_presentation_debug"})
public final class Permissions {
    @org.jetbrains.annotations.NotNull()
    public static final com.sammy.forecast_presentation.utils.Permissions INSTANCE = null;
    
    private Permissions() {
        super();
    }
    
    public final boolean hasLocationPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final void requestLocationPermission(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
    }
}