class Darts {
    double x,y;
    Darts(double x, double y) {
        this.x=x;
        this.y=y;
    }

    int score() {
        double radius=Math.sqrt((x*x)+(y*y));
        int points=0;
        if(radius>0 && radius<=1){
            points=10;
        }
        else if(radius>1 && radius<=5){
            points=5;
        }
        else if(radius>5 && radius<=10){
            points=1;
        }
        return points;
    }

}
