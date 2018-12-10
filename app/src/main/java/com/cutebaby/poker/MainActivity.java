package com.cutebaby.poker;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Poker poker = new Poker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        poker.shuffle();
        RecyclerView pokerlist = findView();
        pokerlist.setHasFixedSize(true);
        pokerlist.setLayoutManager(new LinearLayoutManager(this));
        pokerlist.setAdapter(new PokerAdpter());
    }

    private RecyclerView findView() {
        return findViewById(R.id.re_poker);
    }


    class PokerAdpter extends RecyclerView.Adapter<PokerAdpter.PokerViewHolder> {

        @NonNull
        @Override
        public PokerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = getLayoutInflater().inflate(R.layout.card, parent, false);
            return new PokerViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull PokerViewHolder holder, int position) {
            holder.pokertext.setText(poker.cards[position].get());
        }

        @Override
        public int getItemCount() {
            return poker.cards.length;
        }

        class PokerViewHolder extends RecyclerView.ViewHolder {
            TextView pokertext;

            public PokerViewHolder(@NonNull View itemView) {
                super(itemView);
                pokertext = itemView.findViewById(R.id.poker_row);
            }
        }
    }


   public void shuffle(View view) {
      findView();
    poker.shuffle();
       RecyclerView pokerlist = findView();
       pokerlist.setAdapter(new PokerAdpter());
  }
}
