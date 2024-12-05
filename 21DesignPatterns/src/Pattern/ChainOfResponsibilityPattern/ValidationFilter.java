package Pattern.ChainOfResponsibilityPattern;

public class ValidationFilter extends Filter {

    @Override
    public void doFilter(Request request, Response response) {
        System.out.println("ValidationFilter: Validating data...");
        // 假设进行简单的校验
        if (request.getData().length() <5) {
            response.setData("Validation failed: Data is too short.");
        } else if (next != null) {
            next.doFilter(request, response);  
        }
    }
    
}
