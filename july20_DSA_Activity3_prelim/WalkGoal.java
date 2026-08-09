public class WalkGoal {
    public static void main(String[] args) {
        int morningWalk = 2000;
        int noonWalk = 1500;
        int eveningWalk = 3000;
        
        int totalSteps = morningWalk + noonWalk + eveningWalk;
        String level;

        if (totalSteps >= 7000) {
            level = "🏃 Active & Healthy!";
        } else if (totalSteps >= 4000) {
            level = "🚶 Nice Movement!";
        } else {
            level = "🚶 Go For A Short Walk!";
        }
        System.out.println("Total Steps: " + totalSteps);
        System.out.println("Level: " + level);
    }
}