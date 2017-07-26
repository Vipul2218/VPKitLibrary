package com.naypra.vpkit.common;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;

import com.naypra.vpkit.R;

/**
 * Created by vipulmac on 26/07/17.
 */

public class VPKitProgressDialog {

    public static Dialog mVpKitProgressdialog = null;

    public static void showProgressDialog(Context context) {
        if (context != null) {
            mVpKitProgressdialog = new Dialog(context);
            mVpKitProgressdialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            mVpKitProgressdialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            mVpKitProgressdialog.setCancelable(false);
            mVpKitProgressdialog.setCanceledOnTouchOutside(false);
            mVpKitProgressdialog.setContentView(R.layout.custom_progress_dialog);
            mVpKitProgressdialog.show();
        }
    }

    public static boolean isProgressDialogIsShowing() {
        if (mVpKitProgressdialog == null) {
            return false;
        }
        return mVpKitProgressdialog.isShowing();
    }

    public static void dismissProgressDialog() {
        if (mVpKitProgressdialog == null) {
            return;
        }
        mVpKitProgressdialog.dismiss();
    }

}
