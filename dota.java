package semester1.practice05.homework;

import java.util.Locale;

public class Task4DotaMatchStats {

    public static void main(String[] args) {

        String[] heroes = {
                "Pudge",
                "Invoker",
                "Juggernaut",
                "Crystal Maiden",
                "Earthshaker"
        };

        int[] kills = {8, 12, 10, 2, 4};
        int[] deaths = {6, 3, 2, 9, 5};
        int[] assists = {14, 9, 8, 18, 16};
        int[] netWorth = {14500, 21200, 24800, 9800, 12300};

        double[] kdaRatios = new double[5];

        int totalTeamKills = 0;
        int totalTeamNetWorth = 0;

        for (int i = 0; i < heroes.length; i++) {
            totalTeamKills += kills[i];
            totalTeamNetWorth += netWorth[i];
        }

        for (int i = 0; i < heroes.length; i++) {
            int safeDeaths = Math.max(1, deaths[i]);

            kdaRatios[i] = (double) (kills[i] + assists[i]) / safeDeaths;
        }

        int mvpIndex = 0;

        for (int i = 1; i < heroes.length; i++) {
            if (kdaRatios[i] > kdaRatios[mvpIndex]) {
                mvpIndex = i;
            }
        }

        System.out.println("========================================================================");
        System.out.println("                       🏆 DOTA 2: POST-MATCH REPORT");
        System.out.println("========================================================================");

        System.out.printf(
                "%-16s | %-10s | %-9s | %-9s | %-18s%n",
                "Герой",
                "K / D / A",
                "Net Worth",
                "KDA Ratio",
                "Kill Participation"
        );

        System.out.println("------------------------------------------------------------------------");

        for (int i = 0; i < heroes.length; i++) {

            double killParticipation =
                    ((double) (kills[i] + assists[i]) / totalTeamKills) * 100;

            System.out.printf(
                    Locale.US,
                    "%-16s | %2d / %d / %2d | %,9d | %9.2f | %17.2f%%%n",
                    heroes[i],
                    kills[i],
                    deaths[i],
                    assists[i],
                    netWorth[i],
                    kdaRatios[i],
                    killParticipation
            );
        }

        System.out.println("------------------------------------------------------------------------");

        System.out.printf(
                "Общее количество убийств команды: %d%n",
                totalTeamKills
        );

        System.out.printf(
                "Суммарный Net Worth команды:        %,d золота%n",
                totalTeamNetWorth
        );

        System.out.printf(
                "⭐ ЛУЧШИЙ ИГРОК МАТЧА (MVP):        %s (KDA: %.2f)%n",
                heroes[mvpIndex],
                kdaRatios[mvpIndex]
        );

        System.out.println("========================================================================");
    }
}
