class PolyLine {
    Point[] points;


    public PolyLine(Point... points) {

        this.points = points;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolyLine other = (PolyLine) obj;
        if (points.length != other.points.length) {
            return false;
        }
        for (int i = 0; i < points.length; i++) {
            if (!points[i].equals(other.points[i])) {
                return false;
            }
        }
        return true;
    }
}