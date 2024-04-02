package edu.miu.cs.cs489appsd.lab1a.productmgmtapp;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class ProductMgmtApp {
    public static void main(String[] args) throws JsonProcessingException {

        List<Product> products = new ArrayList<>();

        products.add(new Product(3128874119L, "Banana", "2023-01-24", 124, 0.55));
        products.add(new Product(2927458265L, "Apple", "2022-12-09", 18, 1.09));
        products.add(new Product(9189927460L, "Carrot", "2023-03-31", 89, 2.99));

        Collections.sort(products, Comparator.comparing(Product::getName));

        printProducts(products);
    }

    public static void printProducts(List<Product> products) throws JsonProcessingException {
        //JSON
        System.out.println("Printed in JSON Format");
        ObjectMapper mapper = new ObjectMapper();
        System.out.println("[");
        for (int i = 0; i < products.size(); i++) {
            String json = mapper.writeValueAsString(products.get(i));
            System.out.println("    " + json + (i < products.size() - 1 ? "," : ""));
        }
        System.out.println("]");

        //XML
        System.out.println("----------------------");

        System.out.println("Printed in XML Format");
        Element productsElement = new Element("products");
        Document document = new Document(productsElement);

        for (Product product : products) {
            Element productElement = new Element("product");
            productElement.setAttribute("productId", String.valueOf(product.getProductId()));
            productElement.setAttribute("name", product.getName());
            productElement.setAttribute("dateSupplied", product.getDateSupplied());
            productElement.setAttribute("quantityInStock", String.valueOf(product.getQuantityInStock()));
            productElement.setAttribute("unitPrice", String.valueOf(product.getUnitPrice()));
            productsElement.addContent(productElement);
        }

        XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat());
        String xmlString = xmlOutput.outputString(document);
        System.out.println(xmlString);
        System.out.println("----------------------");

        //CSV
        System.out.println("Printed in Comma-Separated Values (CSV) Format");
        for (Product product : products) {
            System.out.println(
                    product.getProductId() + ", " +
                            "\"" + product.getName() + "\", " +
                            product.getDateSupplied() + ", " +
                            product.getQuantityInStock() + "," +
                            product.getUnitPrice()
            );
        }

    }
}
