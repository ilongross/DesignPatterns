package com.ilongross.patterns.enterprise.view.transform_view;

public class JSONTransformer {
    public String showJSONProduct(Product product) {
        var sb = new StringBuilder();
        sb.append("<html>");
        sb.append("body");
        sb.append("<a ");
        sb.append("name " + product.getName());
        sb.append("/>");
        sb.append("/body");
        sb.append("</html>");
        return  sb.toString();
    }

    public String showHTMLUser(User user) {
        var sb = new StringBuilder();
        sb.append("<html>");
        sb.append("body");
        sb.append("<a ");
        sb.append("name " + user.getAge());
        sb.append("/>");
        sb.append("/body");
        sb.append("</html>");
        return  sb.toString();
    }

}
