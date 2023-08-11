import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
    }

    public void showSelectedRadioButtonLabel(View view) {
        int selectedId = radioGroup.getCheckedRadioButtonId();
        if (selectedId != -1) {
            RadioButton selectedRadioButton = findViewById(selectedId);
            String selectedLabel = selectedRadioButton.getText().toString();
            Toast.makeText(this, selectedLabel, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "라디오 버튼을 선택하세요.", Toast.LENGTH_SHORT).show();
        }
    }
}