import java.util.Scanner;

public class SmartTrafficViolationAnalyzer {

    // Integer violation flags
    static final int SPEEDING = 1;
    static final int UNDERAGE = 2;
    static final int NO_HELMET = 4;
    static final int NO_SEATBELT = 8;
    static final int NO_LICENSE = 16;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter vehicle number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter vehicle speed (km/h): ");
        double speed = sc.nextDouble();

        System.out.print("Enter speed limit (km/h): ");
        double speedLimit = sc.nextDouble();

        System.out.print("Enter driver age: ");
        int age = sc.nextInt();

        System.out.print("Is helmet worn? (true/false): ");
        boolean helmet = sc.nextBoolean();

        System.out.print("Is seat-belt worn? (true/false): ");
        boolean seatBelt = sc.nextBoolean();

        System.out.print("Is the driver carrying a valid license? (true/false): ");
        boolean validLicense = sc.nextBoolean();

        System.out.print("Is this an emergency vehicle? (true/false): ");
        boolean emergencyVehicle = sc.nextBoolean();

        // Violation flag
        int violationFlags = 0;

        // Fine
        double fine = 0;

        /*
         * Speeding:
         * Emergency vehicles are exempt from the speeding rule.
         */
        if (speed > speedLimit && !emergencyVehicle) {
            violationFlags |= SPEEDING;

            double excessSpeed = speed - speedLimit;

            // Fine based on how much the speed limit was exceeded
            if (excessSpeed <= 10) {
                fine += 500;
            } else if (excessSpeed <= 20) {
                fine += 1000;
            } else {
                fine += 2000;
            }
        }

        // Underage driving
        if (age < 18) {
            violationFlags |= UNDERAGE;
            fine += 1500;
        }

        // Helmet violation
        if (!helmet) {
            violationFlags |= NO_HELMET;
            fine += 500;
        }

        // Seat-belt violation
        if (!seatBelt) {
            violationFlags |= NO_SEATBELT;
            fine += 500;
        }

        // Invalid license
        if (!validLicense) {
            violationFlags |= NO_LICENSE;
            fine += 2000;
        }

        // Generate report
        System.out.println("\n======================================");
        System.out.println("       SMART TRAFFIC VIOLATION REPORT");
        System.out.println("======================================");

        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Speed  : " + speed + " km/h");
        System.out.println("Speed Limit    : " + speedLimit + " km/h");
        System.out.println("Driver Age     : " + age);
        System.out.println("Emergency      : " + emergencyVehicle);

        System.out.println("--------------------------------------");

        if (violationFlags == 0) {
            System.out.println("Violation Status: NO VIOLATION");
            System.out.println("Total Fine      : Rs. 0");
        } else {
            System.out.println("Violation Status: VIOLATION DETECTED");

            // Check individual flags using bitwise AND
            if ((violationFlags & SPEEDING) != 0) {
                System.out.println("- Speed limit exceeded");
            }

            if ((violationFlags & UNDERAGE) != 0) {
                System.out.println("- Driver is under 18 years");
            }

            if ((violationFlags & NO_HELMET) != 0) {
                System.out.println("- Helmet not worn");
            }

            if ((violationFlags & NO_SEATBELT) != 0) {
                System.out.println("- Seat-belt not worn");
            }

            if ((violationFlags & NO_LICENSE) != 0) {
                System.out.println("- Invalid driving license");
            }

            System.out.println("--------------------------------------");
            System.out.println("Violation Flags : " + violationFlags);
            System.out.println("Total Fine      : Rs. " + fine);
        }

        System.out.println("======================================");

        sc.close();
    }
}