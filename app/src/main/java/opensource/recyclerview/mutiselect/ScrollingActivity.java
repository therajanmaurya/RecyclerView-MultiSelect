package opensource.recyclerview.mutiselect;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import opensource.recyclerview.mutiselect.activity.MultiSelectionActivity;
import opensource.recyclerview.mutiselect.fragment.FragmentSelectionActivity;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @OnClick(R.id.card_activity)
    void onClickActivityCard() {
        startActivity(new Intent(this, MultiSelectionActivity.class));
    }

    @OnClick(R.id.card_fragment)
    void onClickFragmentCard() {
        startActivity(new Intent(this, FragmentSelectionActivity.class));
    }

    @OnClick(R.id.fab)
    void onClickAbout(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
