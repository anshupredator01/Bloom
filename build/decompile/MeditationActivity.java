/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.media.MediaPlayer
 *  android.os.Bundle
 *  android.os.CountDownTimer
 *  android.speech.tts.TextToSpeech
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.ArrayAdapter
 *  android.widget.ImageButton
 *  android.widget.Spinner
 *  android.widget.SpinnerAdapter
 *  android.widget.TextView
 *  androidx.appcompat.app.ActionBar
 *  androidx.appcompat.app.AlertDialog
 *  androidx.appcompat.app.AlertDialog$Builder
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.lifecycle.ViewModel
 *  androidx.lifecycle.ViewModelProvider
 *  androidx.lifecycle.ViewModelStoreOwner
 *  com.google.android.material.button.MaterialButton
 *  com.google.firebase.auth.FirebaseAuth
 *  com.google.firebase.auth.FirebaseUser
 *  com.miu.meditationapp.R$id
 *  com.miu.meditationapp.databinding.ActivityMeditationBinding
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.miu.meditationapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.miu.meditationapp.R;
import com.miu.meditationapp.databinding.ActivityMeditationBinding;
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
@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0015J\b\u0010&\u001a\u00020\"H\u0014J\u0010\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020)H\u0002J\u000e\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2={"Lcom/miu/meditationapp/MeditationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/miu/meditationapp/databinding/ActivityMeditationBinding;", "currentUser", "Lcom/google/firebase/auth/FirebaseUser;", "getCurrentUser", "()Lcom/google/firebase/auth/FirebaseUser;", "setCurrentUser", "(Lcom/google/firebase/auth/FirebaseUser;)V", "isFullscreen", "", "isRunning", "isVoiceEnabled", "mediaPlayer", "Landroid/media/MediaPlayer;", "minutes", "", "startMin", "textIndicator", "Landroid/widget/TextView;", "timer", "Landroid/os/CountDownTimer;", "tts", "Landroid/speech/tts/TextToSpeech;", "values", "", "", "[Ljava/lang/String;", "viewModel", "Lcom/miu/meditationapp/ui/main/HomeViewModel;", "createTimer", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "showDialog", "context", "Landroid/content/Context;", "speak", "text", "app_debug"})
public final class MeditationActivity
extends AppCompatActivity {
    private ActivityMeditationBinding binding;
    private MediaPlayer mediaPlayer;
    private boolean isFullscreen;
    private TextToSpeech tts;
    private String[] values;
    private long minutes = 20L;
    private long startMin = 20L;
    private TextView textIndicator;
    private CountDownTimer timer;
    private boolean isVoiceEnabled = true;
    private HomeViewModel viewModel;
    public FirebaseUser currentUser;
    private boolean isRunning;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

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

    @SuppressLint(value={"ClickableViewAccessibility"})
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMeditationBinding activityMeditationBinding = ActivityMeditationBinding.inflate((LayoutInflater)this.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue((Object)activityMeditationBinding, (String)"inflate(layoutInflater)");
        this.binding = activityMeditationBinding;
        ActivityMeditationBinding activityMeditationBinding2 = this.binding;
        if (activityMeditationBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"binding");
            activityMeditationBinding2 = null;
        }
        this.setContentView((View)activityMeditationBinding2.getRoot());
        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        this.isFullscreen = true;
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
        String[] arrstring = this.getResources().getStringArray(2130903043);
        Intrinsics.checkNotNullExpressionValue((Object)arrstring, (String)"resources.getStringArray(R.array.minutes)");
        this.values = arrstring;
        Context context2 = (Context)this;
        Object[] arrobject = this.values;
        if (this.values == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"values");
            arrobject = null;
        }
        ArrayAdapter adapter = new ArrayAdapter(context2, 0x1090009, arrobject);
        ((Spinner)this._$_findCachedViewById(R.id.spinner)).setAdapter((SpinnerAdapter)adapter);
        ((Spinner)this._$_findCachedViewById(R.id.spinner)).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(this){
            final /* synthetic */ MeditationActivity this$0;
            {
                this.this$0 = $receiver;
            }

            public void onItemSelected(@NotNull AdapterView<?> parent, @NotNull View view, int position, long id2) {
                Intrinsics.checkNotNullParameter(parent, (String)"parent");
                Intrinsics.checkNotNullParameter((Object)view, (String)"view");
                MeditationActivity.access$setMinutes$p(this.this$0, position == 0 ? 20L : 10L);
                MeditationActivity.access$setStartMin$p(this.this$0, MeditationActivity.access$getMinutes$p(this.this$0));
                TextView textView = MeditationActivity.access$getTextIndicator$p(this.this$0);
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)"textIndicator");
                    textView = null;
                }
                textView.setText((CharSequence)(MeditationActivity.access$getMinutes$p(this.this$0) + ":00"));
                CountDownTimer countDownTimer = MeditationActivity.access$getTimer$p(this.this$0);
                if (countDownTimer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)"timer");
                    countDownTimer = null;
                }
                countDownTimer.cancel();
                MeditationActivity.access$setTimer$p(this.this$0, MeditationActivity.access$createTimer(this.this$0));
            }

            public void onNothingSelected(@NotNull AdapterView<?> parent) {
                Intrinsics.checkNotNullParameter(parent, (String)"parent");
            }
        });
        MediaPlayer mediaPlayer = MediaPlayer.create((Context)this.getApplicationContext(), (int)2131886081);
        Intrinsics.checkNotNullExpressionValue((Object)mediaPlayer, (String)"create(applicationContext, R.raw.back_sound)");
        this.mediaPlayer = mediaPlayer;
        this.timer = this.createTimer();
        ((ImageButton)this._$_findCachedViewById(R.id.close)).setOnClickListener(arg_0 -> MeditationActivity.onCreate$lambda-0(this, arg_0));
        ((ImageButton)this._$_findCachedViewById(R.id.speech)).setOnClickListener(arg_0 -> MeditationActivity.onCreate$lambda-1(this, arg_0));
        ((MaterialButton)this._$_findCachedViewById(R.id.start)).setOnClickListener(arg_0 -> MeditationActivity.onCreate$lambda-2(this, arg_0));
        ((ImageButton)this._$_findCachedViewById(R.id.sound)).setOnClickListener(arg_0 -> MeditationActivity.onCreate$lambda-3(this, arg_0));
    }

    protected void onStop() {
        CountDownTimer countDownTimer;
        super.onStop();
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"mediaPlayer");
            mediaPlayer = null;
        }
        if (mediaPlayer.isPlaying()) {
            MediaPlayer mediaPlayer2 = this.mediaPlayer;
            if (mediaPlayer2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)"mediaPlayer");
                mediaPlayer2 = null;
            }
            mediaPlayer2.stop();
            MediaPlayer mediaPlayer3 = this.mediaPlayer;
            if (mediaPlayer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)"mediaPlayer");
                mediaPlayer3 = null;
            }
            mediaPlayer3.release();
        }
        if ((countDownTimer = this.timer) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"timer");
            countDownTimer = null;
        }
        countDownTimer.cancel();
        if (this.isRunning) {
            HomeViewModel homeViewModel = this.viewModel;
            if (homeViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)"viewModel");
                homeViewModel = null;
            }
            homeViewModel.updateMeditationMinutes((int)(this.startMin - this.minutes));
            HomeViewModel homeViewModel2 = this.viewModel;
            if (homeViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)"viewModel");
                homeViewModel2 = null;
            }
            homeViewModel2.updateMeditationCount();
        }
    }

    public void onBackPressed() {
        this.showDialog((Context)this);
    }

    private final CountDownTimer createTimer() {
        long l = this.minutes * (long)60000;
        return new CountDownTimer(this, l){
            private long sec;
            final /* synthetic */ MeditationActivity this$0;
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
                TextView textView;
                MeditationActivity.access$setMinutes$p(this.this$0, TimeUnit.MILLISECONDS.toMinutes(ms) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(ms)));
                this.sec = TimeUnit.MILLISECONDS.toSeconds(ms) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(ms));
                if ((MeditationActivity.access$getStartMin$p(this.this$0) == 10L && MeditationActivity.access$getMinutes$p(this.this$0) == 9L || MeditationActivity.access$getMinutes$p(this.this$0) == 19L) && this.sec == 55L) {
                    this.this$0.speak("Sit down and relaxing position and close your eyes");
                }
                if (MeditationActivity.access$getMinutes$p(this.this$0) == 2L && this.sec == 10L) {
                    this.this$0.speak("Please keep your eyes closed and stop thinking mantra, take two more minutes");
                }
                if (MeditationActivity.access$getMinutes$p(this.this$0) == 0L && this.sec == 10L) {
                    this.this$0.speak("No you can open your eyes.");
                }
                if ((textView = MeditationActivity.access$getTextIndicator$p(this.this$0)) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)"textIndicator");
                    textView = null;
                }
                textView.setText((CharSequence)(StringsKt.padStart((String)String.valueOf(MeditationActivity.access$getMinutes$p(this.this$0)), (int)2, (char)'0') + ':' + StringsKt.padStart((String)String.valueOf(this.sec), (int)2, (char)'0')));
            }

            public void onFinish() {
                this.this$0.speak("Thank you for doing meditation with me. I hope your feeling great right now after doing this meditation");
                HomeViewModel homeViewModel = MeditationActivity.access$getViewModel$p(this.this$0);
                if (homeViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)"viewModel");
                    homeViewModel = null;
                }
                homeViewModel.updateMeditationMinutes(20);
                HomeViewModel homeViewModel2 = MeditationActivity.access$getViewModel$p(this.this$0);
                if (homeViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)"viewModel");
                    homeViewModel2 = null;
                }
                homeViewModel2.updateMeditationCount();
            }
        };
    }

    public final void speak(@NotNull String text) {
        Intrinsics.checkNotNullParameter((Object)text, (String)"text");
        this.tts = new TextToSpeech(this.getApplicationContext(), arg_0 -> MeditationActivity.speak$lambda-4(this, text, arg_0));
    }

    private final void showDialog(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage((CharSequence)"Do you want to stop meditating ?").setCancelable(true);
        builder.setPositiveButton((CharSequence)"Yes", (arg_0, arg_1) -> MeditationActivity.showDialog$lambda-5(this, arg_0, arg_1));
        builder.setNegativeButton((CharSequence)"Cancel", MeditationActivity::showDialog$lambda-6);
        AlertDialog alertDialog = builder.create();
        Intrinsics.checkNotNullExpressionValue((Object)alertDialog, (String)"builder.create()");
        AlertDialog alert = alertDialog;
        alert.setTitle((CharSequence)"Are you sure");
        alert.show();
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

    private static final void onCreate$lambda-0(MeditationActivity this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        this$0.showDialog((Context)this$0);
    }

    private static final void onCreate$lambda-1(MeditationActivity this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        if (this$0.isVoiceEnabled) {
            this$0.isVoiceEnabled = false;
            ((ImageButton)this$0._$_findCachedViewById(R.id.speech)).setImageResource(2131230886);
        } else {
            this$0.isVoiceEnabled = true;
            ((ImageButton)this$0._$_findCachedViewById(R.id.speech)).setImageResource(2131230885);
        }
    }

    private static final void onCreate$lambda-2(MeditationActivity this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        CountDownTimer countDownTimer = this$0.timer;
        if (countDownTimer == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"timer");
            countDownTimer = null;
        }
        countDownTimer.start();
        ((Spinner)this$0._$_findCachedViewById(R.id.spinner)).setEnabled(false);
        ((Spinner)this$0._$_findCachedViewById(R.id.spinner)).setClickable(false);
        MediaPlayer mediaPlayer = this$0.mediaPlayer;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"mediaPlayer");
            mediaPlayer = null;
        }
        mediaPlayer.setLooping(true);
        MediaPlayer mediaPlayer2 = this$0.mediaPlayer;
        if (mediaPlayer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"mediaPlayer");
            mediaPlayer2 = null;
        }
        mediaPlayer2.start();
        ((MaterialButton)this$0._$_findCachedViewById(R.id.start)).setClickable(false);
        ((MaterialButton)this$0._$_findCachedViewById(R.id.start)).setText((CharSequence)"Started");
        this$0.isRunning = true;
    }

    private static final void onCreate$lambda-3(MeditationActivity this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        MediaPlayer mediaPlayer = this$0.mediaPlayer;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"mediaPlayer");
            mediaPlayer = null;
        }
        if (mediaPlayer.isPlaying()) {
            ((ImageButton)this$0._$_findCachedViewById(R.id.sound)).setImageResource(2131230917);
            MediaPlayer mediaPlayer2 = this$0.mediaPlayer;
            if (mediaPlayer2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)"mediaPlayer");
                mediaPlayer2 = null;
            }
            mediaPlayer2.pause();
        } else {
            ((ImageButton)this$0._$_findCachedViewById(R.id.sound)).setImageResource(2131230916);
            MediaPlayer mediaPlayer3 = this$0.mediaPlayer;
            if (mediaPlayer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)"mediaPlayer");
                mediaPlayer3 = null;
            }
            mediaPlayer3.start();
        }
    }

    private static final void speak$lambda-4(MeditationActivity this$0, String $text, int it) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        Intrinsics.checkNotNullParameter((Object)$text, (String)"$text");
        if (this$0.isVoiceEnabled && it == 0) {
            TextToSpeech textToSpeech = this$0.tts;
            if (textToSpeech == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)"tts");
                textToSpeech = null;
            }
            textToSpeech.setLanguage(Locale.US);
            TextToSpeech textToSpeech2 = this$0.tts;
            if (textToSpeech2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)"tts");
                textToSpeech2 = null;
            }
            textToSpeech2.setSpeechRate(0.8f);
            TextToSpeech textToSpeech3 = this$0.tts;
            if (textToSpeech3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)"tts");
                textToSpeech3 = null;
            }
            textToSpeech3.speak($text, 1, null);
        }
    }

    private static final void showDialog$lambda-5(MeditationActivity this$0, DialogInterface dialog, int which) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        this$0.finish();
    }

    private static final void showDialog$lambda-6(DialogInterface dialog, int which) {
        dialog.cancel();
    }

    public static final /* synthetic */ void access$setMinutes$p(MeditationActivity $this, long l) {
        $this.minutes = l;
    }

    public static final /* synthetic */ void access$setStartMin$p(MeditationActivity $this, long l) {
        $this.startMin = l;
    }

    public static final /* synthetic */ long access$getMinutes$p(MeditationActivity $this) {
        return $this.minutes;
    }

    public static final /* synthetic */ TextView access$getTextIndicator$p(MeditationActivity $this) {
        return $this.textIndicator;
    }

    public static final /* synthetic */ CountDownTimer access$getTimer$p(MeditationActivity $this) {
        return $this.timer;
    }

    public static final /* synthetic */ void access$setTimer$p(MeditationActivity $this, CountDownTimer countDownTimer) {
        $this.timer = countDownTimer;
    }

    public static final /* synthetic */ CountDownTimer access$createTimer(MeditationActivity $this) {
        return $this.createTimer();
    }

    public static final /* synthetic */ long access$getStartMin$p(MeditationActivity $this) {
        return $this.startMin;
    }

    public static final /* synthetic */ HomeViewModel access$getViewModel$p(MeditationActivity $this) {
        return $this.viewModel;
    }
}
