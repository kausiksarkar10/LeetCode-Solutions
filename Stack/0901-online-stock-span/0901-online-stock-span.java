class StockSpanner {

    Stack<Integer> prices;
    Stack<Integer> spans ;

    public StockSpanner() {
        prices = new Stack<>();
        spans = new Stack<>();
    }

    public int next(int price) {

        int currentSpan = 1;

        while (!prices.isEmpty() && prices.peek() <= price) {

            prices.pop();

            int previousSpan = spans.pop();

            currentSpan += previousSpan;
        }

        prices.push(price);
        spans.push(currentSpan);

        return currentSpan;
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */