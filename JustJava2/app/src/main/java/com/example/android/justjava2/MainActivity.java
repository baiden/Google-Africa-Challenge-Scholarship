package com.example.android.justjava2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int quantity = 1;
    int basePrice = 5;
    boolean checked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        //Whipped Cream Checkbox
        CheckBox whippedCreamCheckbox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        boolean hasWhippedToppings = whippedCreamCheckbox.isChecked();

        //Chocolate Checkbox
        CheckBox chocolateCheckbox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean hasChocolateToppings = chocolateCheckbox.isChecked();

        int price = calculatePrice(hasWhippedToppings, hasChocolateToppings);

        EditText nameEditText = (EditText) findViewById(R.id.name_text_input);
        String nameOfCustomer = nameEditText.getText().toString();

        String priceMessage = createOrderSummary(nameOfCustomer, price, hasWhippedToppings, hasChocolateToppings);
        Toast.makeText(this, "Loading...Please Wait", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.order_summary_email_subject, nameOfCustomer));
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * Computes the price for x cup(s)
     *
     * @param addWhippedCreamCost adds two to the base price if it is checked
     * @param addChocolateCost    adds one to the base price if it is checked
     * @return text summary of price
     */
    private int calculatePrice(boolean addWhippedCreamCost, boolean addChocolateCost) {

        if (addWhippedCreamCost) {
            basePrice += 1;
        }
        if (addChocolateCost) {
            basePrice += 2;
        }
        return quantity * basePrice;
    }

    /**
     * Create summary of order
     *
     * @param price                of the order
     * @param addWhippedToppings   contains boolean value of whipped cream checkbox
     * @param addChocolateToppings contains boolean value of chocolate checkbox
     * @return text summary of order
     */
    private String createOrderSummary(String name, int price, boolean addWhippedToppings, boolean addChocolateToppings) {
        String priceMessage = getString(R.string.order_summary_name, name);
        priceMessage += "\n" + getString(R.string.order_summary_whipped_cream, addWhippedToppings);
        priceMessage += "\n" + getString(R.string.order_summary_chocolate, addChocolateToppings);
        priceMessage += "\n" + getString(R.string.order_summary_quantity, quantity);
        priceMessage += "\nTotal: \u20B5" + price;
        priceMessage += "\n" + getString(R.string.thank_you);

        return priceMessage;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int value) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + value);
    }

    public void increment(View view) {
        if (quantity == 100) {

            // Show an error message as a toast
            Toast.makeText(this, getString(R.string.too_many_coffees), Toast.LENGTH_SHORT).show();

            // Exit this method early because there's nothing left to do
            return;
        }

        quantity += 1;
        displayQuantity(quantity);

        /** Alternative: My way **/
//        if (quantity <= 99) {
//            quantity += 1;
//            displayQuantity(quantity);
//        } else {
//            Toast.makeText(this, "Sorry, you can't have more 100 coffees! :(", Toast.LENGTH_SHORT).show();
//        }
    }

    public void decrement(View view) {
        if (quantity == 1) {

            // Show an error message as a toast
            Toast.makeText(this, getString(R.string.too_few_coffees), Toast.LENGTH_SHORT).show();

            // Exit this method early because there's nothing left to do
            return;
        }

        quantity -= 1;
        displayQuantity(quantity);

        /** Alternative: My way**/
//        if (quantity <= 1) {
//            Toast.makeText(this, "Sorry, you can't have less than 1 coffee! :(", Toast.LENGTH_SHORT).show();
//        } else {
//            quantity -= 1;
//            displayQuantity(quantity);
//        }
    }

}
