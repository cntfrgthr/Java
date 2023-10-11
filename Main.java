public class Main {
    public static void main(String[] args) {

    }
}

class DataGraph{
    final int N = 10;
    double[] data = new double[N];

    public double[] getData(){
        return this.data;
    }
}

class LineGraph{
    LineGraph(){
        DataGraph dg = new DataGraph();
    }
}

class BarGraph{
    BarGraph(){
        DataGraph dg = new DataGraph();
    }
}

class ChartGraph{
    ChartGraph(){
        DataGraph dg = new DataGraph();
    }
}
