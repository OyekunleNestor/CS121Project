package WeekFourteen.dateFormatActivity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TotalCalories {

    public static int calculateTotalCalories(int caloriesPerDay, String startDate, String endDate) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

            // Parse start and end dates
            Date startDateObj = dateFormat.parse(startDate);
            Date endDateObj = dateFormat.parse(endDate);

            // Calculate the number of days on the diet
            long differenceInMillis = endDateObj.getTime() - startDateObj.getTime();
            int daysOnDiet = (int) (differenceInMillis / (1000 * 60 * 60 * 24));

            // Calculate total calories consumed
            int totalCalories = caloriesPerDay * daysOnDiet;

            return totalCalories;
        } catch (ParseException e) {
            e.printStackTrace();
            return -1; // Return -1 if there's an error
        }
    }
}
