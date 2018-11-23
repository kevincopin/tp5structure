public class LinkedIntList implements IntList {
    private Cell first;

    public LinkedIntList() {
        first = null;
    }


    @Override
    public boolean isEmpty() {
        if(first==null){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public IntList cons(int n) {
        while(first!=null){
            first=first+n;
            first=first.nextCell();
        }
        return LinkedIntList;
    }

    @Override
    public int length() {
        int length=0;
        while(first!=null){
            first=first.nextCell;
            length++;
        }
    }

    int gethead(int head){
    head=first.getDataCell();
    return head;
    }

    IntList gettail(IntList tail){
    IntList tail = new LinkedIntList();
    tail=first.nextCell();
    return tail;
    }
}


