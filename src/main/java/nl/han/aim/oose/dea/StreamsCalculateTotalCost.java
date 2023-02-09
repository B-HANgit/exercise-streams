package nl.han.aim.oose.dea;

import nl.han.aim.oose.dea.helpers.Product;
import nl.han.aim.oose.dea.helpers.ProductCategory;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsCalculateTotalCost {
    int calculateTotalCostOfAllProducts(List<Product> products) {
        // TODO: implement

//        return products.stream();
//                .???;
        return 0;

//          ANSWER:
//        products.stream()
//                .mapToInt(Product::getPrice)
//                .sum();
    }

    int calculateTotalCostOfAllGadgets(List<Product> products) {
        // TODO: implement

        return 0;

//        ANSWER:
//        return products.stream()
//                .filter(p -> p.getCategory().equals(ProductCategory.GADGETS))
//                .mapToInt(Product::getPrice)
//                .sum();
    }
}
