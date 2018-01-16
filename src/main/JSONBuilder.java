package main;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import paragraf.Paragraph;
import work.Element;
import work.Image;
import work.ImageProxy;
import work.Section;

import java.io.FileReader;

public class JSONBuilder implements Builder {

    private String fileName;
    private Element result;

    public JSONBuilder(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Builder buildPart() {
        JSONParser parser = new JSONParser();

        try {

            JSONObject JO = (JSONObject) parser.parse(new FileReader(fileName));

            result = GetElement(JO);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    private Element GetElement(JSONObject PO) {
        String type = (String) PO.get("class");
        switch (type) {
            case "Section": {
                String titlu = (String) PO.get("titlu");
                Section section = new Section(titlu);
                JSONArray listOfChildren = (JSONArray) PO.get("continut");
                for (int i = 0; i < listOfChildren.size(); i++)
                    section.addElement(GetElement((JSONObject) listOfChildren.get(i)));
                return section;
            }
            case "Paragraph": {
                String text = (String) PO.get("text");
                return new Paragraph().setText(text);
            }
            case "ImageProxy": {
                String url = (String) PO.get("url");
                return new ImageProxy(url);
            }
            case "Image": {
                String url = (String) PO.get("url");
                return new Image(url);
            }
            default:
                return null;
        }


    }

    @Override
    public Element getResult() {
        return result;
    }
}
