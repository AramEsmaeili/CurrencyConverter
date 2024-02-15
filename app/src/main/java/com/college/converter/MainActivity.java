package com.college.converter;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.college.converter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    static private final Float CONVERSION_RATE = 0.80F;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.convertButton.setOnClickListener(view -> convertCurrency());
    }

    public void convertCurrency() {
        String inputAmount = binding.entryId.getText().toString();

        if (!inputAmount.isEmpty()) {
            Float inputAmountDecimal = Float.valueOf(inputAmount);
            Float resultFloat = inputAmountDecimal * CONVERSION_RATE;
            binding.resultId.setText(resultFloat + " Euros");
        }
    }
}
