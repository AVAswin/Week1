class PetrolPump {
    int petrol, distance;
    public PetrolPump(int p, int d) {
        petrol = p;
        distance = d;
    }
}

class CircularTour {
    public int findStartingPoint(PetrolPump[] pumps) {
        int start = 0, totalSurplus = 0, currSurplus = 0;

        for (int i = 0; i < pumps.length; i++) {
            totalSurplus += pumps[i].petrol - pumps[i].distance;
            currSurplus += pumps[i].petrol - pumps[i].distance;

            if (currSurplus < 0) {
                start = i + 1;
                currSurplus = 0;
            }
        }

        return totalSurplus >= 0 ? start : -1;
    }
}

