package com.example.android_seminar_8_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        final int[] images = {R.drawable.pastitsio , R.drawable.makaronia , R.drawable.fasolakia , R.drawable.gemista};

        ArrayList<Suntagi> suntages = new ArrayList<>();

        suntages.add(new Suntagi(1 , "pastitsio" , "Όσα χρόνια κι αν περάσουν, το παραδοσιακό παστίτσιο της μαμάς θα είναι πάντα από τα αγαπημένα φαγητά όλων μας! Συνταγή κλασική και αγαπημένη, με όλα τα μυστικά της" , R.drawable.pastitsio));
        suntages.add(new Suntagi(2 , "makaronia" , "Για ζυμαρικά που δεν λασπώνουν, δεν αρκεί να τηρείτε τους χρόνους βρασμού που αναγράφονται στις συσκευασίες. Το μυστικό κρύβεται στο σωστό βράσιμο." , R.drawable.makaronia));
        suntages.add(new Suntagi(3 , "fasolakia" , "Τα κοκκινιστά φασολάκια είναι το πιο αγαπημένο λαδερό φαγητό. Εύκολη συνταγή με πολλά μυστικά. Το μεγάλο μου μυστικό είναι ότι τα μαγειρεύω χωρίς καθόλου νερό! Πιο νόστιμα λαδερά φασολάκια, δεν έχεις γευτεί ξανά." , R.drawable.fasolakia));
        suntages.add(new Suntagi(4 , "gemista" , "Φτιάξτε εύκολα και γρήγορα το πιο αγαπημένο λαδερό φαγητό, τα γεμιστά με ρύζι" , R.drawable.gemista));

        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        UserAdapter userAdapter = new UserAdapter(MainActivity.this , suntages);

        recyclerView.setAdapter(userAdapter);



    }
}
