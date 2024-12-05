package Demo;

import Pattern.ChainOfResponsibilityPattern.CharsetConversionFilter;
import Pattern.ChainOfResponsibilityPattern.DataTypeConversionFilter;
import Pattern.ChainOfResponsibilityPattern.Request;
import Pattern.ChainOfResponsibilityPattern.Response;
import Pattern.ChainOfResponsibilityPattern.ValidationFilter;
import Pattern.ChainOfResponsibilityPattern.Filter;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Request request = new Request("abcdefg123456");
        Response response = new Response();
        Filter charsetFilter = new CharsetConversionFilter();
        Filter dataTypeFilter = new DataTypeConversionFilter();
        Filter validationFilter = new ValidationFilter();

        // 设置责任链
        charsetFilter.setNext(dataTypeFilter).setNext(validationFilter);
        
        charsetFilter.doFilter(request, response);
        System.out.println("Final Data: " +request.getData());
    }
}
