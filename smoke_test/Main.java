// Real, standalone smoke test for the PARENA-compiled BatteryUi class, run OUTSIDE Android
// entirely (a real, live JDK compile+run, not just "javac accepted it") -- the same real bar
// PARENA/STDLIB.md's own BezierInterp/Humanness three-target proof already holds itself to.
// Compile: javac -d /tmp/out app/src/main/java/industrial/einhorn/spiderbeetle/generated/BatteryUi.java smoke_test/Main.java
// Run:     java -cp /tmp/out Main
import industrial.einhorn.spiderbeetle.generated.BatteryUi;

public class Main {
    public static void main(String[] args) {
        int failures = 0;

        boolean r1 = BatteryUi.shouldShowLowBatteryWarning(10, false);
        if (r1 != true) { System.out.println("FAIL: low battery, not charging -> should warn"); failures++; }
        else { System.out.println("PASS: low battery, not charging -> warns"); }

        boolean r2 = BatteryUi.shouldShowLowBatteryWarning(5, true);
        if (r2 != false) { System.out.println("FAIL: low battery but charging -> should NOT warn"); failures++; }
        else { System.out.println("PASS: low battery but charging -> no warning"); }

        boolean r3 = BatteryUi.shouldShowLowBatteryWarning(50, false);
        if (r3 != false) { System.out.println("FAIL: healthy battery -> should NOT warn"); failures++; }
        else { System.out.println("PASS: healthy battery, not charging -> no warning"); }

        boolean r4 = BatteryUi.shouldShowLowBatteryWarning(15, false);
        if (r4 != true) { System.out.println("FAIL: exactly at the 15% threshold -> should warn"); failures++; }
        else { System.out.println("PASS: exactly at the 15% threshold -> warns (boundary is inclusive)"); }

        double r5 = BatteryUi.clampBrightness(0.5);
        if (r5 != 0.5) { System.out.println("FAIL: mid-range brightness should pass through unchanged"); failures++; }
        else { System.out.println("PASS: mid-range brightness passes through unchanged"); }

        double r6 = BatteryUi.clampBrightness(-0.2);
        if (r6 != 0.05) { System.out.println("FAIL: negative brightness should clamp to the 0.05 floor"); failures++; }
        else { System.out.println("PASS: negative brightness clamps to the 0.05 floor"); }

        double r7 = BatteryUi.clampBrightness(5.0);
        if (r7 != 1.0) { System.out.println("FAIL: over-bright request should clamp to the 1.0 ceiling"); failures++; }
        else { System.out.println("PASS: over-bright request clamps to the 1.0 ceiling"); }

        System.out.println();
        System.out.println(failures == 0 ? "ALL PASS" : "SOME FAILED");
        System.exit(failures == 0 ? 0 : 1);
    }
}
