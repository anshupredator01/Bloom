/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.Button
 *  android.widget.ProgressBar
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidx.appcompat.app.AppCompatActivity
 *  com.google.android.gms.tasks.Task
 *  com.google.android.material.textfield.TextInputEditText
 *  com.google.firebase.auth.FirebaseAuth
 *  com.google.firebase.auth.FirebaseUser
 *  com.miu.meditationapp.R$id
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.miu.meditationapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.miu.meditationapp.LoginAddUser;
import com.miu.meditationapp.MainActivity;
import com.miu.meditationapp.OnboardingActivity;
import com.miu.meditationapp.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010&\u001a\u00020'J\u0012\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\b\u0010,\u001a\u00020)H\u0014J\b\u0010-\u001a\u00020)H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006."}, d2={"Lcom/miu/meditationapp/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "inputEmail", "Lcom/google/android/material/textfield/TextInputEditText;", "getInputEmail", "()Lcom/google/android/material/textfield/TextInputEditText;", "setInputEmail", "(Lcom/google/android/material/textfield/TextInputEditText;)V", "inputPassword", "getInputPassword", "setInputPassword", "loadingPB", "Landroid/widget/ProgressBar;", "getLoadingPB", "()Landroid/widget/ProgressBar;", "setLoadingPB", "(Landroid/widget/ProgressBar;)V", "loginbutton", "Landroid/widget/Button;", "getLoginbutton", "()Landroid/widget/Button;", "setLoginbutton", "(Landroid/widget/Button;)V", "mAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "getMAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "setMAuth", "(Lcom/google/firebase/auth/FirebaseAuth;)V", "preferences", "Landroid/content/SharedPreferences;", "registertv", "Landroid/widget/TextView;", "getRegistertv", "()Landroid/widget/TextView;", "setRegistertv", "(Landroid/widget/TextView;)V", "isSeenOnbaord", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "startMainActivity", "app_debug"})
public final class LoginActivity
extends AppCompatActivity {
    public TextInputEditText inputEmail;
    public TextInputEditText inputPassword;
    public Button loginbutton;
    public TextView registertv;
    public ProgressBar loadingPB;
    public FirebaseAuth mAuth;
    private SharedPreferences preferences;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    @NotNull
    public final TextInputEditText getInputEmail() {
        TextInputEditText textInputEditText = this.inputEmail;
        if (textInputEditText != null) {
            return textInputEditText;
        }
        Intrinsics.throwUninitializedPropertyAccessException((String)"inputEmail");
        return null;
    }

    public final void setInputEmail(@NotNull TextInputEditText textInputEditText) {
        Intrinsics.checkNotNullParameter((Object)textInputEditText, (String)"<set-?>");
        this.inputEmail = textInputEditText;
    }

    @NotNull
    public final TextInputEditText getInputPassword() {
        TextInputEditText textInputEditText = this.inputPassword;
        if (textInputEditText != null) {
            return textInputEditText;
        }
        Intrinsics.throwUninitializedPropertyAccessException((String)"inputPassword");
        return null;
    }

    public final void setInputPassword(@NotNull TextInputEditText textInputEditText) {
        Intrinsics.checkNotNullParameter((Object)textInputEditText, (String)"<set-?>");
        this.inputPassword = textInputEditText;
    }

    @NotNull
    public final Button getLoginbutton() {
        Button button = this.loginbutton;
        if (button != null) {
            return button;
        }
        Intrinsics.throwUninitializedPropertyAccessException((String)"loginbutton");
        return null;
    }

    public final void setLoginbutton(@NotNull Button button) {
        Intrinsics.checkNotNullParameter((Object)button, (String)"<set-?>");
        this.loginbutton = button;
    }

    @NotNull
    public final TextView getRegistertv() {
        TextView textView = this.registertv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException((String)"registertv");
        return null;
    }

    public final void setRegistertv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter((Object)textView, (String)"<set-?>");
        this.registertv = textView;
    }

    @NotNull
    public final ProgressBar getLoadingPB() {
        ProgressBar progressBar = this.loadingPB;
        if (progressBar != null) {
            return progressBar;
        }
        Intrinsics.throwUninitializedPropertyAccessException((String)"loadingPB");
        return null;
    }

    public final void setLoadingPB(@NotNull ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter((Object)progressBar, (String)"<set-?>");
        this.loadingPB = progressBar;
    }

    @NotNull
    public final FirebaseAuth getMAuth() {
        FirebaseAuth firebaseAuth = this.mAuth;
        if (firebaseAuth != null) {
            return firebaseAuth;
        }
        Intrinsics.throwUninitializedPropertyAccessException((String)"mAuth");
        return null;
    }

    public final void setMAuth(@NotNull FirebaseAuth firebaseAuth) {
        Intrinsics.checkNotNullParameter((Object)firebaseAuth, (String)"<set-?>");
        this.mAuth = firebaseAuth;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(2131558430);
        TextInputEditText textInputEditText = (TextInputEditText)this._$_findCachedViewById(R.id.input_email);
        Intrinsics.checkNotNullExpressionValue((Object)textInputEditText, (String)"input_email");
        this.setInputEmail(textInputEditText);
        TextInputEditText textInputEditText2 = (TextInputEditText)this._$_findCachedViewById(R.id.input_password);
        Intrinsics.checkNotNullExpressionValue((Object)textInputEditText2, (String)"input_password");
        this.setInputPassword(textInputEditText2);
        View view = this.findViewById(2131361896);
        Intrinsics.checkNotNullExpressionValue((Object)view, (String)"findViewById(R.id.btn_login)");
        this.setLoginbutton((Button)view);
        View view2 = this.findViewById(2131362151);
        Intrinsics.checkNotNullExpressionValue((Object)view2, (String)"findViewById(R.id.registerTV)");
        this.setRegistertv((TextView)view2);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Intrinsics.checkNotNullExpressionValue((Object)firebaseAuth, (String)"getInstance()");
        this.setMAuth(firebaseAuth);
        View view3 = this.findViewById(2131362140);
        Intrinsics.checkNotNullExpressionValue((Object)view3, (String)"findViewById(R.id.progressbar)");
        this.setLoadingPB((ProgressBar)view3);
        SharedPreferences sharedPreferences = this.getSharedPreferences("ONBOARD", 0);
        Intrinsics.checkNotNullExpressionValue((Object)sharedPreferences, (String)"getSharedPreferences(\"ON\u2026D\", Context.MODE_PRIVATE)");
        this.preferences = sharedPreferences;
        this.getRegistertv().setOnClickListener(arg_0 -> LoginActivity.onCreate$lambda-0(this, arg_0));
        this.getLoginbutton().setOnClickListener(arg_0 -> LoginActivity.onCreate$lambda-2(this, arg_0));
    }

    private final void startMainActivity() {
        if (this.isSeenOnbaord()) {
            this.startActivity(new Intent((Context)this, MainActivity.class));
        } else {
            this.startActivity(new Intent((Context)this, OnboardingActivity.class));
        }
        this.finish();
    }

    protected void onStart() {
        super.onStart();
        FirebaseUser user = this.getMAuth().getCurrentUser();
        if (user != null) {
            this.startMainActivity();
        }
    }

    public final boolean isSeenOnbaord() {
        SharedPreferences sharedPreferences = this.preferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"preferences");
            sharedPreferences = null;
        }
        return sharedPreferences.getBoolean("ISCOMPLETE", false);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int id2) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(id2);
        if (view == null) {
            View view2 = this.findViewById(id2);
            if (view2 != null) {
                map.put(id2, view2);
                view = view2;
            } else {
                view = null;
            }
        }
        return view;
    }

    private static final void onCreate$lambda-0(LoginActivity this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        this$0.startActivity(new Intent((Context)this$0, LoginAddUser.class));
    }

    private static final void onCreate$lambda-2$lambda-1(LoginActivity this$0, Task task) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        Intrinsics.checkNotNullParameter((Object)task, (String)"task");
        if (task.isSuccessful()) {
            this$0.getLoadingPB().setVisibility(8);
            Toast.makeText((Context)((Context)this$0), (CharSequence)"Login Successful..", (int)0).show();
            this$0.startMainActivity();
        } else {
            this$0.getLoadingPB().setVisibility(8);
            Toast.makeText((Context)((Context)this$0), (CharSequence)"Email or Password is wrong. Please try again.", (int)0).show();
        }
    }

    private static final void onCreate$lambda-2(LoginActivity this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        String email = String.valueOf((Object)this$0.getInputEmail().getText());
        String pwd = String.valueOf((Object)this$0.getInputPassword().getText());
        if (TextUtils.isEmpty((CharSequence)email) || TextUtils.isEmpty((CharSequence)pwd)) {
            Toast.makeText((Context)((Context)this$0), (CharSequence)"Please enter your credentials", (int)0).show();
        } else {
            this$0.getMAuth().signInWithEmailAndPassword(email, pwd).addOnCompleteListener((Activity)this$0, arg_0 -> LoginActivity.onCreate$lambda-2$lambda-1(this$0, arg_0));
        }
    }
}
