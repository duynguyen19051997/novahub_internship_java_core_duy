package week_1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegularExpressions<match> {
    private static final String TEXT = "Nguyen Vu Anh Duy";


    public static void main(String[] args) {
        // String to be scanned to find the pattern.
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
        } else {
            System.out.println("NO MATCH");
        }

        /* . khớp với bất kỳ ký tự nào */
        String s1 = "a";
        System.out.println("s1=" + s1);
        // Kiểm tra toàn bộ s1
        // Khớp với bất kỳ ký tự nào
        // Quy tắc: .
        // ==> true
        boolean match = s1.matches(".");
        System.out.println("-Match . " + match);

        s1 = "abc";
        System.out.println("s1=" + s1);
        // Kiểm tra toàn bộ s1
        // Khớp với bất kỳ ký tự nào.
        // ==> false  (Rõ ràng, chuỗi 3 ký tự sao khớp với 1 ký tự bất kỳ?)
        match = s1.matches(".");
        System.out.println("-Match . " + match);

        // Kiểm tra toàn bộ s1
        // Khớp với bất kỳ ký tự nào 0 hoặc nhiều lần
        // Kết hợp các quy tắc: . và *
        // ==> true
        match = s1.matches(".*");
        System.out.println("-Match .* " + match);


        /* ^ bắt đầu bởi một ký tự nào đó */
        String s2 = "m";
        System.out.println("s2=" + s2);
        // Kiểm tra toàn bộ s2
        // Bắt đầu bởi m
        // Quy tắc ^
        // true
        match = s2.matches("^m");
        System.out.println("-Match ^m " + match);

        s2 = "mnp";
        System.out.println("s2=" + s2);
        // Kiểm tra toàn bộ s2
        // Bắt đầu bởi m
        // Quy tắc ^
        // ==> false  (Rõ ràng, chuỗi 3 ký tự sao khớp với 1 ký tự bất kỳ bắt đầu bởi m)
        match = s2.matches("^m");
        System.out.println("-Match ^m " + match);

        // Bắt đầu bởi m
        // Sau đó là ký tự bất kỳ, xuất hiện 1 hoặc nhiều lần.
        // Quy tắc ^ và . và +
        // true
        match = s2.matches("^m.+");
        System.out.println("-Match ^m.+ " + match);


        /* $ kết thúc bởi một ký tự nào đó */
        String s3 = "p";
        System.out.println("s3=" + s3);
        // Kiểm tra s3 kết thúc bằng p
        // Quy tắc $
        // true
        match = s3.matches("p$");
        System.out.println("-Match p$ " + match);

        s3 = "2nnp";
        System.out.println("s3=" + s3);
        // Kiểm tra toàn bộ s3
        // Kết thúc bằng p
        // ==> false  (Rõ ràng, chuỗi 4 ký tự sao khớp với 1 ký tự p cuối cùng)
        match = s3.matches("p$");
        System.out.println("-Match p$ " + match);

        // Kiểm tra toàn bộ s3
        // Ký tự bất kỳ xuất hiện 1 lần: .
        // tiếp theo là n, xuất hiện 1 hoặc tối đa 3 lần.
        // Kết thúc bởi p: p$
        // Kết hợp các quy tắc: . , {X,Y}, $
        // true
        match = s3.matches(".n{1,3}p$");
        System.out.println("-Match .n{1,3}p$ " + match);

        String s4 = "2ybcd";
        System.out.println("s4=" + s4);
        // Bắt đầu là 2
        // Tiếp theo x hoặc y hoặc z
        // Tiếp theo bất kỳ 1 hoặc nhiểu lần.
        // Kết hợp các quy tắc: [abc] , . , +
        // true
        match = s4.matches("2[xyz].+");

        System.out.println("-Match 2[xyz].+ " + match);

        String s5 = "2bkbv";
        // Bắt đầu là bất kỳ, 1 hoặc nhiểu lần
        // Tiếp theo a hoặc b, hoặc c: [abc]
        // Tiếp theo z hoặc v: [zv]
        // Tiếp theo bất kỳ
        // true
        match = s5.matches(".+[abc][zv].*");

        System.out.println("-Match .+[abc][zv].* " + match);


        /* Split with regex */
        System.out.println("TEXT: " + TEXT);
        String regex = "\\s+";
        String[] splitString = TEXT.split(regex);
        for (String str : splitString) {
            System.out.println(str);
        }
        String newString = TEXT.replaceAll(regex, "**");
        System.out.println(newString);
    }

}
