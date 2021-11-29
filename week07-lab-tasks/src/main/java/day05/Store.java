package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){

        if (product.getSellDate().isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Date is incorrect");
        }
        products.add(product);
    }

    public Path writeToFileByMonth(Month month){
        List<String> result = createStringByMonth(month);

        try {
            StringBuilder stringBuilder = new StringBuilder().append("soldproducts_").append(month.name()).append(".csv");
            Path path = Path.of(stringBuilder.toString());
            Files.write(path,result);
            return path;
        } catch (IOException e){
            throw new IllegalArgumentException("Can not write file",e );
        }

    }

    private List<String> createStringByMonth(Month month) {
        List<String> result = new ArrayList<>();
        for(Product product: products){
            if(product.getSellDate().getMonth() == month){
                result.add(product.toString());
            }
        }
        return result;
    }
}