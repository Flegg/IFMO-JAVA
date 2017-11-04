package com.ifmo.num;

public enum Planets {
    MERCURY(3.3e23, 2.4, 58),
    VENUS(4.9e24, 6.1, 108),
    EARTH(6e24, 6.4, 150),
    MARS(6.4e23, 3.4, 228),
    JUPITER(1.9e27, 71, 778),
    SATURN(5.7e26, 60, 1429),
    URANUS(8.7e25, 26, 2871),
    NEPTUNE(1e26, 25, 4504);

    private final double weight;       // in kilograms
    private final double planetRadius; // in thousand of kilometers
    private final int orbitRadius;     // in millions of kilometers

    Planets(double weight, double planetRadius, int orbitRadius) {
        this.weight = weight;
        this.planetRadius = planetRadius;
        this.orbitRadius = orbitRadius;
    }

    public double getWeight() {
        return weight;
    }

    public double getPlanetRadius() {
        return planetRadius;
    }

    public int getOrbitRadius() {
        return orbitRadius;
    }

    public static void main(String[] args) {
        for (Planets planet:Planets.values()) {
            System.out.printf(planet.name() + ": масса = %.1e килограмм, радиус = %.1f тыс. километров, " +
                    "радиус орбиты = %d миллионов километров\n",
                    planet.getWeight(), planet.getPlanetRadius(), planet.getOrbitRadius());
        }
    }
}
