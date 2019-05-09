package by.anjei;

import java.io.File;
import java.util.LinkedList;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class YamlTesting {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            Pipeline pipeline = mapper.readValue(new File("pipeline.yaml"), Pipeline.class);
            System.out.println(ReflectionToStringBuilder.toString(pipeline, ToStringStyle.MULTI_LINE_STYLE));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}