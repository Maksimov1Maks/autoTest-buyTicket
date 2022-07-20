package base;

import java.time.Duration;

public class Config {

      private static Duration implicitWait = Duration.ofSeconds(15);
      private static String url = "https://www.aviasales.ru/?params=MOW1";
      private static Boolean browserQuit = true;
      private static Duration explicitWait = Duration.ofSeconds(10);
      private static Duration visibilityOfAllElements = Duration.ofSeconds(50);

    public static Duration getVisibilityOfAllElements() {
        return visibilityOfAllElements;
    }

    public static Duration getImplicitWait() {
        return implicitWait;
    }

    public static Duration getExplicitWait() {
        return explicitWait;
    }

    public static String getUrl () {
         return url;
      }

   public static Boolean getBrowserQuit() {
      return browserQuit;
   }
}
