class Line{
    Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Line other = (Line) obj;
        return (this.start.equals(other.start) && this.end.equals(other.end));
    }

    @Override
    public Line clone() {
        return new Line(new Point(this.start.getX(), this.start.getY()), new Point(this.end.getX(), this.end.getY()));
    }
}

