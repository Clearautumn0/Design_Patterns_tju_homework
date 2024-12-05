package Pattern.ChainOfResponsibilityPattern;

// 编码转换过滤器
public class CharsetConversionFilter extends Filter {

    @Override
    public void doFilter(Request request, Response response) {
        System.out.println("CharsetConversionFilter: Converting character encoding...");
        // 假设进行编码转换
        request.setData(request.getData().toUpperCase()); // 模拟字符编码转换

        if (next != null) {
            next.doFilter(request, response);  
        }
    }

}
