package dahay01.rating;

import android.net.Uri;
import android.test.AndroidTestCase;

/**
 * Unit test for {@link dahay01.rating.UriHelper}
 */
public class UriHelperTest extends AndroidTestCase {

    private static final String GOOGLE_PLAY = "https://play.google.com/store/apps/details?id=";

    public void testGetGooglePlayUri() {
        {
            Uri uri = UriHelper.getGooglePlay("");
            assertEquals(uri.toString(), GOOGLE_PLAY);
        }
        {
            Uri uri = UriHelper.getGooglePlay(null);
            assertNull(uri);
        }
        {
            final String packageName = "dahay01.rating";
            Uri uri = UriHelper.getGooglePlay(packageName);
            assertEquals(uri.toString(), GOOGLE_PLAY + packageName);
        }
    }
}
