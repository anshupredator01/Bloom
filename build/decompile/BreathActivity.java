/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.os.Bundle
 *  android.os.CountDownTimer
 *  android.speech.tts.TextToSpeech
 *  android.view.View
 *  android.widget.ImageButton
 *  android.widget.TextView
 *  androidx.appcompat.app.AlertDialog
 *  androidx.appcompat.app.AlertDialog$Builder
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.lifecycle.ViewModel
 *  androidx.lifecycle.ViewModelProvider
 *  androidx.lifecycle.ViewModelStoreOwner
 *  com.airbnb.lottie.LottieAnimationView
 *  com.google.android.material.button.MaterialButton
 *  com.google.firebase.auth.FirebaseAuth
 *  com.google.firebase.auth.FirebaseUser
 *  com.miu.meditationapp.R$id
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.miu.meditationapp;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.miu.meditationapp.BreathActivity;
import com.miu.meditationapp.R;
import com.miu.meditationapp.ui.main.HomeViewModel;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u001eH\u0014J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0002J\u0006\u0010%\u001a\u00020\u001eJ\b\u0010&\u001a\u00020\u001eH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006'"}, d2={"Lcom/miu/meditationapp/BreathActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "currentUser", "Lcom/google/firebase/auth/FirebaseUser;", "getCurrentUser", "()Lcom/google/firebase/auth/FirebaseUser;", "setCurrentUser", "(Lcom/google/firebase/auth/FirebaseUser;)V", "isRunning", "", "()Z", "setRunning", "(Z)V", "minutes", "", "getMinutes", "()J", "setMinutes", "(J)V", "textIndicator", "Landroid/widget/TextView;", "timer", "Landroid/os/CountDownTimer;", "tts", "Landroid/speech/tts/TextToSpeech;", "viewModel", "Lcom/miu/meditationapp/ui/main/HomeViewModel;", "createTimer", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "showDialog", "context", "Landroid/content/Context;", "stopExercise", "toggle", "app_debug"})
public final class BreathActivity
extends AppCompatActivity {
    private TextView textIndicator;
    private CountDownTimer timer;
    private boolean isRunning;
    private HomeViewModel viewModel;
    public FirebaseUser currentUser;
    private long minutes = 3L;
    private TextToSpeech tts;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    public final boolean isRunning() {
        return this.isRunning;
    }

    public final void setRunning(boolean bl) {
        this.isRunning = bl;
    }

    @NotNull
    public final FirebaseUser getCurrentUser() {
        FirebaseUser firebaseUser = this.currentUser;
        if (firebaseUser != null) {
            return firebaseUser;
        }
        Intrinsics.throwUninitializedPropertyAccessException((String)"currentUser");
        return null;
    }

    public final void setCurrentUser(@NotNull FirebaseUser firebaseUser) {
        Intrinsics.checkNotNullParameter((Object)firebaseUser, (String)"<set-?>");
        this.currentUser = firebaseUser;
    }

    public final long getMinutes() {
        return this.minutes;
    }

    public final void setMinutes(long l) {
        this.minutes = l;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(2131558428);
        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        Intrinsics.checkNotNull((Object)firebaseUser);
        this.setCurrentUser(firebaseUser);
        String uid = FirebaseAuth.getInstance().getUid();
        ViewModel viewModel = new ViewModelProvider((ViewModelStoreOwner)this).get(HomeViewModel.class);
        Intrinsics.checkNotNullExpressionValue((Object)viewModel, (String)"ViewModelProvider(this).\u2026omeViewModel::class.java)");
        this.viewModel = (HomeViewModel)viewModel;
        HomeViewModel homeViewModel = this.viewModel;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"viewModel");
            homeViewModel = null;
        }
        Context context = this.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue((Object)context, (String)"applicationContext");
        String string = uid;
        Intrinsics.checkNotNull((Object)string);
        homeViewModel.init(context, string);
        TextView textView = (TextView)this._$_findCachedViewById(R.id.indicator);
        Intrinsics.checkNotNullExpressionValue((Object)textView, (String)"indicator");
        this.textIndicator = textView;
        this.timer = this.createTimer();
        ((MaterialButton)this._$_findCachedViewById(R.id.start)).setOnClickListener(arg_0 -> BreathActivity.onCreate$lambda-0(this, arg_0));
        ((ImageButton)this._$_findCachedViewById(R.id.close)).setOnClickListener(arg_0 -> BreathActivity.onCreate$lambda-1(this, arg_0));
    }

    private final void toggle() {
        if (this.isRunning) {
            this.stopExercise();
            ((MaterialButton)this._$_findCachedViewById(R.id.start)).setText((CharSequence)"Start");
        } else {
            ((LottieAnimationView)this._$_findCachedViewById(R.id.breathe)).playAnimation();
            ((MaterialButton)this._$_findCachedViewById(R.id.start)).setText((CharSequence)this.getString(2131951761));
            CountDownTimer countDownTimer = this.timer;
            if (countDownTimer == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)"timer");
                countDownTimer = null;
            }
            countDownTimer.start();
        }
    }

    private final CountDownTimer createTimer() {
        return new CountDownTimer(this, 180000L){
            private long sec;
            final /* synthetic */ BreathActivity this$0;
            {
                this.this$0 = $receiver;
                super($super_call_param$1, 1000L);
            }

            public final long getSec() {
                return this.sec;
            }

            public final void setSec(long l) {
                this.sec = l;
            }

            public void onTick(long ms) {
                this.this$0.setRunning(true);
                this.this$0.setMinutes(TimeUnit.MILLISECONDS.toMinutes(ms) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(ms)));
                this.sec = TimeUnit.MILLISECONDS.toSeconds(ms) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(ms));
                TextView textView = BreathActivity.access$getTextIndicator$p(this.this$0);
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)"textIndicator");
                    textView = null;
                }
                textView.setText((CharSequence)(StringsKt.padStart((String)String.valueOf(this.this$0.getMinutes()), (int)2, (char)'0') + ':' + StringsKt.padStart((String)String.valueOf(this.sec), (int)2, (char)'0')));
                if (this.this$0.getMinutes() == 2L && this.sec == 57L) {
                    BreathActivity.access$setTts$p(this.this$0, new TextToSpeech(this.this$0.getApplicationContext(), arg_0 -> createTimer.1.onTick$lambda-0(this.this$0, arg_0)));
                }
            }

            public void onFinish() {
                this.this$0.stopExercise();
            }

            private static final void onTick$lambda-0(BreathActivity this$0, int it) {
                Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
                if (it == 0) {
                    TextToSpeech textToSpeech = BreathActivity.access$getTts$p(this$0);
                    if (textToSpeech == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)"tts");
                        textToSpeech = null;
                    }
                    textToSpeech.setLanguage(Locale.US);
                    TextToSpeech textToSpeech2 = BreathActivity.access$getTts$p(this$0);
                    if (textToSpeech2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)"tts");
                        textToSpeech2 = null;
                    }
                    textToSpeech2.setSpeechRate(0.8f);
                    TextToSpeech textToSpeech3 = BreathActivity.access$getTts$p(this$0);
                    if (textToSpeech3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)"tts");
                        textToSpeech3 = null;
                    }
                    textToSpeech3.speak("Inhale through your nose and exhale through your mouth", 1, null);
                }
            }
        };
    }

    public final void stopExercise() {
        ((LottieAnimationView)this._$_findCachedViewById(R.id.breathe)).pauseAnimation();
        this.isRunning = false;
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"timer");
            countDownTimer = null;
        }
        countDownTimer.cancel();
    }

    private final void showDialog(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage((CharSequence)"Do you want to stop breathing exercise ?").setCancelable(true);
        builder.setPositiveButton((CharSequence)"Yes", (arg_0, arg_1) -> BreathActivity.showDialog$lambda-2(this, arg_0, arg_1));
        builder.setNegativeButton((CharSequence)"Cancel", BreathActivity::showDialog$lambda-3);
        AlertDialog alertDialog = builder.create();
        Intrinsics.checkNotNullExpressionValue((Object)alertDialog, (String)"builder.create()");
        AlertDialog alert = alertDialog;
        alert.setTitle((CharSequence)"Are you sure");
        alert.show();
    }

    protected void onStop() {
        super.onStop();
        HomeViewModel homeViewModel = this.viewModel;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"viewModel");
            homeViewModel = null;
        }
        homeViewModel.updateBreatheMin((int)(3L - this.minutes));
        HomeViewModel homeViewModel2 = this.viewModel;
        if (homeViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"viewModel");
            homeViewModel2 = null;
        }
        homeViewModel2.updateBreatheCount();
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"timer");
            countDownTimer = null;
        }
        countDownTimer.cancel();
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

    private static final void onCreate$lambda-0(BreathActivity this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        this$0.toggle();
    }

    private static final void onCreate$lambda-1(BreathActivity this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        this$0.showDialog((Context)this$0);
    }

    private static final void showDialog$lambda-2(BreathActivity this$0, DialogInterface dialog, int which) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        this$0.finish();
    }

    private static final void showDialog$lambda-3(DialogInterface dialog, int which) {
        dialog.cancel();
    }

    public static final /* synthetic */ TextView access$getTextIndicator$p(BreathActivity $this) {
        return $this.textIndicator;
    }

    public static final /* synthetic */ void access$setTts$p(BreathActivity $this, TextToSpeech textToSpeech) {
        $this.tts = textToSpeech;
    }

    public static final /* synthetic */ TextToSpeech access$getTts$p(BreathActivity $this) {
        return $this.tts;
    }
}
