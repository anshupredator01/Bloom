/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.AlarmManager
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ProgressBar
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentActivity
 *  androidx.lifecycle.ViewModel
 *  androidx.lifecycle.ViewModelProvider
 *  androidx.lifecycle.ViewModelStoreOwner
 *  com.google.android.material.button.MaterialButton
 *  com.google.android.material.card.MaterialCardView
 *  com.google.android.material.timepicker.MaterialTimePicker
 *  com.google.android.material.timepicker.MaterialTimePicker$Builder
 *  com.google.firebase.auth.FirebaseAuth
 *  com.google.firebase.auth.FirebaseUser
 *  com.google.firebase.database.DataSnapshot
 *  com.google.firebase.database.DatabaseReference
 *  com.google.firebase.database.FirebaseDatabase
 *  com.miu.meditationapp.R$id
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.miu.meditationapp.ui.main;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.miu.meditationapp.BreathActivity;
import com.miu.meditationapp.MeditationActivity;
import com.miu.meditationapp.R;
import com.miu.meditationapp.helper.NotificationReceiver;
import com.miu.meditationapp.ui.main.HomeViewModel;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ&\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u001aH\u0016J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0010H\u0002J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006'"}, d2={"Lcom/miu/meditationapp/ui/main/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "alarmManager", "Landroid/app/AlarmManager;", "calendar", "Ljava/util/Calendar;", "currentUser", "Lcom/google/firebase/auth/FirebaseUser;", "getCurrentUser", "()Lcom/google/firebase/auth/FirebaseUser;", "setCurrentUser", "(Lcom/google/firebase/auth/FirebaseUser;)V", "database", "Lcom/google/firebase/database/DatabaseReference;", "pView", "Landroid/view/View;", "getPView", "()Landroid/view/View;", "setPView", "(Landroid/view/View;)V", "picker", "Lcom/google/android/material/timepicker/MaterialTimePicker;", "viewModel", "Lcom/miu/meditationapp/ui/main/HomeViewModel;", "cancelAlarm", "", "createNotificationChannel", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "updateReportProgress", "view", "updateReportTexts", "app_debug"})
public final class HomeFragment
extends Fragment {
    public FirebaseUser currentUser;
    private AlarmManager alarmManager;
    private Calendar calendar;
    private MaterialTimePicker picker;
    private DatabaseReference database;
    private HomeViewModel viewModel;
    public View pView;
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

    @NotNull
    public final View getPView() {
        View view = this.pView;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException((String)"pView");
        return null;
    }

    public final void setPView(@NotNull View view) {
        Intrinsics.checkNotNullParameter((Object)view, (String)"<set-?>");
        this.pView = view;
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter((Object)inflater, (String)"inflater");
        View view = inflater.inflate(2131558460, container, false);
        Intrinsics.checkNotNullExpressionValue((Object)view, (String)"view");
        this.setPView(view);
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue((Object)calendar, (String)"getInstance()");
        this.calendar = calendar;
        this.createNotificationChannel();
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
        Context context = this.requireContext();
        Intrinsics.checkNotNullExpressionValue((Object)context, (String)"requireContext()");
        String string = uid;
        Intrinsics.checkNotNull((Object)string);
        homeViewModel.init(context, string);
        this.updateReportTexts(view);
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("users");
        Intrinsics.checkNotNullExpressionValue((Object)databaseReference, (String)"getInstance().getReference(\"users\")");
        this.database = databaseReference;
        DatabaseReference databaseReference2 = this.database;
        if (databaseReference2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"database");
            databaseReference2 = null;
        }
        databaseReference2.child(uid).get().addOnSuccessListener(arg_0 -> HomeFragment.onCreateView$lambda-0(this, arg_0)).addOnFailureListener(arg_0 -> HomeFragment.onCreateView$lambda-1(this, arg_0));
        Context context2 = this.getContext();
        Object object = context2 != null ? context2.getSystemService("alarm") : null;
        if (object == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
        }
        this.alarmManager = (AlarmManager)object;
        ((MaterialCardView)view.findViewById(R.id.button)).setOnClickListener(arg_0 -> HomeFragment.onCreateView$lambda-2(this, arg_0));
        ((MaterialCardView)view.findViewById(R.id.breathe)).setOnClickListener(arg_0 -> HomeFragment.onCreateView$lambda-3(this, arg_0));
        this.updateReportProgress(view);
        ((MaterialButton)view.findViewById(R.id.remind)).setOnClickListener(arg_0 -> HomeFragment.onCreateView$lambda-6(this, arg_0));
        return view;
    }

    private final void updateReportTexts(View view) {
        TextView textView = (TextView)view.findViewById(R.id.val_meditate_times);
        HomeViewModel homeViewModel = this.viewModel;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"viewModel");
            homeViewModel = null;
        }
        textView.setText((CharSequence)String.valueOf(homeViewModel.getMeditationCount()));
        TextView textView2 = (TextView)view.findViewById(R.id.val_meditate);
        HomeViewModel homeViewModel2 = this.viewModel;
        if (homeViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"viewModel");
            homeViewModel2 = null;
        }
        textView2.setText((CharSequence)String.valueOf(homeViewModel2.getMeditationMin()));
        TextView textView3 = (TextView)view.findViewById(R.id.val_breathe_times);
        HomeViewModel homeViewModel3 = this.viewModel;
        if (homeViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"viewModel");
            homeViewModel3 = null;
        }
        textView3.setText((CharSequence)String.valueOf(homeViewModel3.getBreatheCount()));
        TextView textView4 = (TextView)view.findViewById(R.id.val_breathe);
        HomeViewModel homeViewModel4 = this.viewModel;
        if (homeViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"viewModel");
            homeViewModel4 = null;
        }
        textView4.setText((CharSequence)String.valueOf(homeViewModel4.getBreatheMin()));
    }

    private final void updateReportProgress(View view) {
        HomeViewModel homeViewModel = this.viewModel;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"viewModel");
            homeViewModel = null;
        }
        int medMin = homeViewModel.getMeditationMin();
        HomeViewModel homeViewModel2 = this.viewModel;
        if (homeViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"viewModel");
            homeViewModel2 = null;
        }
        int breMin = homeViewModel2.getBreatheMin();
        HomeViewModel homeViewModel3 = this.viewModel;
        if (homeViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"viewModel");
            homeViewModel3 = null;
        }
        int medCount = homeViewModel3.getMeditationCount();
        HomeViewModel homeViewModel4 = this.viewModel;
        if (homeViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"viewModel");
            homeViewModel4 = null;
        }
        int breCount = homeViewModel4.getBreatheCount();
        int percentage = 1;
        if (medCount > 0 && breCount > 0) {
            percentage = (medMin + breMin) * 100 / (medCount * 20) + breCount * 3;
        }
        ((ProgressBar)view.findViewById(R.id.statusBar)).setProgress(percentage);
        ((TextView)view.findViewById(R.id.val_meditate_times)).setText((CharSequence)String.valueOf(medCount));
        ((TextView)view.findViewById(R.id.val_meditate)).setText((CharSequence)String.valueOf(medMin));
        ((TextView)view.findViewById(R.id.val_breathe_times)).setText((CharSequence)String.valueOf(breCount));
        ((TextView)view.findViewById(R.id.val_breathe)).setText((CharSequence)String.valueOf(breMin));
    }

    public void onResume() {
        this.updateReportTexts(this.getPView());
        this.updateReportProgress(this.getPView());
        super.onResume();
    }

    public final void createNotificationChannel() {
        block1: {
            NotificationManager notificationManager;
            if (Build.VERSION.SDK_INT < 26) break block1;
            CharSequence name = "MORNING Meditation Channel";
            String description = "Channel for morning meditation remender";
            int importance = 3;
            NotificationChannel channel = new NotificationChannel("MORNING", name, importance);
            channel.setDescription(description);
            Context context = this.getContext();
            NotificationManager notificationManager2 = notificationManager = context != null ? (NotificationManager)context.getSystemService(NotificationManager.class) : null;
            if (notificationManager2 != null) {
                notificationManager2.createNotificationChannel(channel);
            }
        }
    }

    public final void cancelAlarm() {
        AlarmManager alarmManager;
        Intent intent = new Intent(this.getContext(), MeditationActivity.class);
        PendingIntent pendingInteng = PendingIntent.getBroadcast((Context)this.getContext(), (int)200, (Intent)intent, (int)0);
        AlarmManager alarmManager2 = this.alarmManager;
        if (alarmManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"alarmManager");
            alarmManager2 = null;
        }
        if ((alarmManager = this.alarmManager) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"alarmManager");
            alarmManager = null;
        }
        alarmManager.cancel(pendingInteng);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int id2) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(id2);
        if (view == null) {
            View view2;
            View view3 = this.getView();
            if (view3 != null && (view2 = view3.findViewById(id2)) != null) {
                map.put(id2, view2);
                view = view2;
            } else {
                view = null;
            }
        }
        return view;
    }

    private static final void onCreateView$lambda-0(HomeFragment this$0, DataSnapshot it) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        if (it.exists()) {
            ((TextView)this$0._$_findCachedViewById(R.id.textView3)).setText((CharSequence)String.valueOf(it.child("firstname").getValue()));
        } else {
            Toast.makeText((Context)this$0.getContext(), (CharSequence)"Check your Internet connection.", (int)0).show();
        }
    }

    private static final void onCreateView$lambda-1(HomeFragment this$0, Exception it) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        Intrinsics.checkNotNullParameter((Object)it, (String)"it");
        Toast.makeText((Context)this$0.getContext(), (CharSequence)"Couldn't find the user. Internet connection have to connected properly.", (int)0).show();
    }

    private static final void onCreateView$lambda-2(HomeFragment this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        this$0.startActivity(new Intent(this$0.getContext(), MeditationActivity.class));
    }

    private static final void onCreateView$lambda-3(HomeFragment this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        this$0.startActivity(new Intent(this$0.getContext(), BreathActivity.class));
    }

    private static final void onCreateView$lambda-6$lambda-5(HomeFragment this$0, View it) {
        MaterialTimePicker materialTimePicker;
        MaterialTimePicker materialTimePicker2;
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        this$0.cancelAlarm();
        Calendar calendar = this$0.calendar;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"calendar");
            calendar = null;
        }
        if ((materialTimePicker2 = this$0.picker) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"picker");
            materialTimePicker2 = null;
        }
        calendar.set(11, materialTimePicker2.getHour());
        Calendar calendar2 = this$0.calendar;
        if (calendar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"calendar");
            calendar2 = null;
        }
        if ((materialTimePicker = this$0.picker) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"picker");
            materialTimePicker = null;
        }
        calendar2.set(12, materialTimePicker.getMinute());
        Calendar calendar3 = this$0.calendar;
        if (calendar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"calendar");
            calendar3 = null;
        }
        calendar3.set(13, 0);
        Calendar calendar4 = this$0.calendar;
        if (calendar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"calendar");
            calendar4 = null;
        }
        calendar4.set(14, 0);
        Intent intent = new Intent(this$0.getContext(), NotificationReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast((Context)this$0.getContext(), (int)200, (Intent)intent, (int)0);
        Intrinsics.checkNotNullExpressionValue((Object)pendingIntent, (String)"getBroadcast(this.context, 200, intent, 0)");
        PendingIntent pendingIntent2 = pendingIntent;
        Context context = this$0.getContext();
        Object object = context != null ? context.getSystemService("alarm") : null;
        if (object == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
        }
        AlarmManager alarmManager = (AlarmManager)object;
        Calendar calendar5 = this$0.calendar;
        if (calendar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"calendar");
            calendar5 = null;
        }
        alarmManager.setInexactRepeating(0, calendar5.getTimeInMillis(), 86400000L, pendingIntent2);
        Context context2 = this$0.getContext();
        StringBuilder stringBuilder = new StringBuilder().append("Successfully set reminder at: ");
        Calendar calendar6 = this$0.calendar;
        if (calendar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"calendar");
            calendar6 = null;
        }
        StringBuilder stringBuilder2 = stringBuilder.append(calendar6.get(11)).append(':');
        Calendar calendar7 = this$0.calendar;
        if (calendar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"calendar");
            calendar7 = null;
        }
        Toast.makeText((Context)context2, (CharSequence)stringBuilder2.append(calendar7.get(12)).append(" every day.").toString(), (int)0).show();
    }

    private static final void onCreateView$lambda-6(HomeFragment this$0, View it) {
        MaterialTimePicker materialTimePicker;
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        MaterialTimePicker materialTimePicker2 = new MaterialTimePicker.Builder().setTimeFormat(0).setHour(12).setMinute(0).setTitleText((CharSequence)"Select Reminder time").build();
        Intrinsics.checkNotNullExpressionValue((Object)materialTimePicker2, (String)"Builder()\n              \u2026\n                .build()");
        this$0.picker = materialTimePicker2;
        FragmentActivity fragmentActivity = this$0.getActivity();
        if (fragmentActivity != null) {
            FragmentActivity it1 = fragmentActivity;
            boolean bl = false;
            MaterialTimePicker materialTimePicker3 = this$0.picker;
            if (materialTimePicker3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)"picker");
                materialTimePicker3 = null;
            }
            materialTimePicker3.show(it1.getSupportFragmentManager(), "GENO");
        }
        if ((materialTimePicker = this$0.picker) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"picker");
            materialTimePicker = null;
        }
        materialTimePicker.addOnPositiveButtonClickListener(arg_0 -> HomeFragment.onCreateView$lambda-6$lambda-5(this$0, arg_0));
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        this._$_clearFindViewByIdCache();
    }
}
