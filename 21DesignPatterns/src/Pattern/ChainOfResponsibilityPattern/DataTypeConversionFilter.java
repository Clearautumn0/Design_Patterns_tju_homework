package Pattern.ChainOfResponsibilityPattern;

public class DataTypeConversionFilter extends Filter {

    @Override
    public void doFilter(Request request, Response response) {
        System.out.println("DataTypeConversionFilter: Converting data type...");
        // 假设进行数据类型转换
        request.setData(request.getData().replaceAll("[^A-Za-z]", "")); // 模拟数据类型转换

        if (next != null) {
            next.doFilter(request, response);  
        }
    }

}
