package Pattern.ChainOfResponsibilityPattern;

public abstract class Filter {
    protected Filter next;

    public Filter setNext(Filter next) {
        this.next = next;
        return next;
    }

    public abstract void doFilter(Request request,Response response);

}
