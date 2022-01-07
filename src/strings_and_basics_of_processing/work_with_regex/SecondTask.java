package strings_and_basics_of_processing.work_with_regex;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Aliaksandr Yamrom
 * @task Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
 * тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
 * нельзя.
 */
public class SecondTask {
    private static String getDocumentFromXml(String filepath) {
        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(Paths.get(filepath));
        } catch (IOException e) {
            System.out.println("Error!");
        }
        return new String(bytes, StandardCharsets.UTF_8);
    }

    private static void printNodes() {
        List<String> list = parseXML(getDocumentFromXml("D:\\Java\\EpamCourse\\src\\Strings_and_basics_of_processing\\Work_with_regex\\text.xml"));
        for (String node :
                list) {
            System.out.println(node);
        }
    }

    private static List<String> parseXML(String doc) {
        ArrayList<String> nodes = new ArrayList<>();

        Pattern pattern = Pattern.compile("(?s)<([^\\s]+)(.*?)>(.+?)</(\\1)>|<(.+?)/>");
        Matcher matcher = pattern.matcher(doc);

        while (matcher.find()) {
            if (matcher.group(3) == null) {
                nodes.add(nodeWithoutBody(matcher));
            } else {
                nodes.add(getNode(matcher));
                nodes.addAll(parseXML(matcher.group(3)));
            }
        }
        return nodes;
    }

    private static String getNode(Matcher matcher) {
        StringBuilder builder  = new StringBuilder();
        builder.append("---\nNode:\n");
        builder.append("Open tag: ").append(matcher.group(1)).append(matcher.group(2)).append("\n");
        builder.append("Close tag: \\").append(matcher.group(4)).append("\n");
        builder.append("Tag content: ").append(matcher.group(3)).append("\n");
        builder.append("Tag with body" + "\n");
        builder.append("---\n");
        return builder.toString();
    }

    private static String nodeWithoutBody(Matcher matcher) {
        StringBuilder builder = new StringBuilder();
        builder.append("---\nNode:\n");
        builder.append("Open tag: ").append(matcher.group(5)).append("\n");
        builder.append("Close tag is missing").append("\n");
        builder.append("Tag content is missing").append("\n");
        builder.append("Tag without body").append("\n");
        builder.append("---\n");
        return builder.toString();
    }

    public static void main(String[] args) {
        printNodes();
    }
}
