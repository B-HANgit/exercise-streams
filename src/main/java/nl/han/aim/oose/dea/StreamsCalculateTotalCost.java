package nl.han.aim.oose.dea;

import nl.han.aim.oose.dea.helpers.Product;
import nl.han.aim.oose.dea.helpers.ProductCategory;

import java.util.List;

public class StreamsCalculateTotalCost {
    int calculateTotalCostOfAllProducts(List<Product> products) {
        // TODO: implement

        return 0;
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
