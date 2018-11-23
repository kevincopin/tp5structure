public class Cell {
    int data;
    Cell nextCell;


    public Cell(int n, Cell cell) {
        this.data = n;
        this.nextCell = cell;
    }

    public int getDataCell() {
        return data;
    }

    public Cell getNextCell() {
        return nextCell;
    }

    public void setDataCell(int data) {
        this.data = data;
    }

    public void setNextCell(Cell cell) {
        this.nextCell = cell;
    }

}