/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.core.content.ContextCompat
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.viewpager2.widget.ViewPager2
 *  androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
 *  com.google.android.material.button.MaterialButton
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.miu.meditationapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.miu.meditationapp.MainActivity;
import com.miu.meditationapp.OnboardingItem;
import com.miu.meditationapp.OnboardingItemsAdapter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\nH\u0002J\b\u0010\u0013\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2={"Lcom/miu/meditationapp/OnboardingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "indicatorContainer", "Landroid/widget/LinearLayout;", "onboardingItemsAdapter", "Lcom/miu/meditationapp/OnboardingItemsAdapter;", "preferences", "Landroid/content/SharedPreferences;", "navigateToHomeActivity", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setCompleteOnboarding", "setCurrentIndicator", "position", "", "setOnboardingItems", "setupIndicators", "app_debug"})
public final class OnboardingActivity
extends AppCompatActivity {
    private OnboardingItemsAdapter onboardingItemsAdapter;
    private LinearLayout indicatorContainer;
    private SharedPreferences preferences;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(2131558434);
        SharedPreferences sharedPreferences = this.getApplicationContext().getSharedPreferences("ONBOARD", 0);
        Intrinsics.checkNotNullExpressionValue((Object)sharedPreferences, (String)"applicationContext.getSh\u2026D\", Context.MODE_PRIVATE)");
        this.preferences = sharedPreferences;
        this.setOnboardingItems();
        this.setupIndicators();
        this.setCurrentIndicator(0);
    }

    private final void setOnboardingItems() {
        this.onboardingItemsAdapter = new OnboardingItemsAdapter(CollectionsKt.listOf((Object)new OnboardingItem(2131230852, "Welcome to deep", "We'll show you how to train your mind for happier, healthier life.")));
        ViewPager2 onboardingViewPager = (ViewPager2)this.findViewById(2131362121);
        OnboardingItemsAdapter onboardingItemsAdapter = this.onboardingItemsAdapter;
        if (onboardingItemsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"onboardingItemsAdapter");
            onboardingItemsAdapter = null;
        }
        onboardingViewPager.setAdapter((RecyclerView.Adapter)onboardingItemsAdapter);
        onboardingViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback(this){
            final /* synthetic */ OnboardingActivity this$0;
            {
                this.this$0 = $receiver;
            }

            public void onPageSelected(int position) {
                super.onPageSelected(position);
                OnboardingActivity.access$setCurrentIndicator(this.this$0, position);
            }
        });
        View view = onboardingViewPager.getChildAt(0);
        if (view == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        ((RecyclerView)view).setOverScrollMode(2);
        ((ImageView)this.findViewById(2131362012)).setOnClickListener(arg_0 -> OnboardingActivity.setOnboardingItems$lambda-0(onboardingViewPager, this, arg_0));
        ((TextView)this.findViewById(2131362252)).setOnClickListener(arg_0 -> OnboardingActivity.setOnboardingItems$lambda-1(this, arg_0));
        ((MaterialButton)this.findViewById(2131361898)).setOnClickListener(arg_0 -> OnboardingActivity.setOnboardingItems$lambda-2(this, arg_0));
    }

    private final void navigateToHomeActivity() {
        this.startActivity(new Intent(this.getApplicationContext(), MainActivity.class));
        this.finish();
    }

    private final void setCompleteOnboarding() {
        SharedPreferences sharedPreferences = this.preferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"preferences");
            sharedPreferences = null;
        }
        sharedPreferences.edit().putBoolean("ISCOMPLETE", true).apply();
    }

    private final void setupIndicators() {
        View view = this.findViewById(2131362023);
        Intrinsics.checkNotNullExpressionValue((Object)view, (String)"findViewById(R.id.indicatorsContainer)");
        this.indicatorContainer = (LinearLayout)view;
        OnboardingItemsAdapter onboardingItemsAdapter = this.onboardingItemsAdapter;
        if (onboardingItemsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"onboardingItemsAdapter");
            onboardingItemsAdapter = null;
        }
        ImageView[] indicators = new ImageView[onboardingItemsAdapter.getItemCount()];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(8, 0, 8, 0);
        int n = indicators.length;
        for (int i = 0; i < n; ++i) {
            ImageView it;
            indicators[i] = new ImageView(this.getApplicationContext());
            if (indicators[i] == null) continue;
            boolean bl = false;
            it.setImageDrawable(ContextCompat.getDrawable((Context)this.getApplicationContext(), (int)2131230869));
            it.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            LinearLayout linearLayout = this.indicatorContainer;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)"indicatorContainer");
                linearLayout = null;
            }
            linearLayout.addView((View)it);
        }
    }

    private final void setCurrentIndicator(int position) {
        LinearLayout linearLayout = this.indicatorContainer;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"indicatorContainer");
            linearLayout = null;
        }
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; ++i) {
            LinearLayout linearLayout2 = this.indicatorContainer;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)"indicatorContainer");
                linearLayout2 = null;
            }
            View view = linearLayout2.getChildAt(i);
            if (view == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ImageView imageView = (ImageView)view;
            imageView.setScaleType(ImageView.ScaleType.FIT_END);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            imageView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            if (i == position) {
                imageView.setImageDrawable(ContextCompat.getDrawable((Context)this.getApplicationContext(), (int)2131230869));
                continue;
            }
            imageView.setImageDrawable(ContextCompat.getDrawable((Context)this.getApplicationContext(), (int)2131230870));
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int id) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(id);
        if (view == null) {
            View view2 = this.findViewById(id);
            if (view2 != null) {
                map.put(id, view2);
                view = view2;
            } else {
                view = null;
            }
        }
        return view;
    }

    private static final void setOnboardingItems$lambda-0(ViewPager2 $onboardingViewPager, OnboardingActivity this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        int n = $onboardingViewPager.getCurrentItem() + 1;
        OnboardingItemsAdapter onboardingItemsAdapter = this$0.onboardingItemsAdapter;
        if (onboardingItemsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"onboardingItemsAdapter");
            onboardingItemsAdapter = null;
        }
        if (n < onboardingItemsAdapter.getItemCount()) {
            $onboardingViewPager.setCurrentItem($onboardingViewPager.getCurrentItem() + 1);
        } else {
            this$0.navigateToHomeActivity();
            this$0.setCompleteOnboarding();
        }
    }

    private static final void setOnboardingItems$lambda-1(OnboardingActivity this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        this$0.navigateToHomeActivity();
    }

    private static final void setOnboardingItems$lambda-2(OnboardingActivity this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)((Object)this$0), (String)"this$0");
        this$0.navigateToHomeActivity();
        this$0.setCompleteOnboarding();
    }

    public static final /* synthetic */ void access$setCurrentIndicator(OnboardingActivity $this, int position) {
        $this.setCurrentIndicator(position);
    }
}
