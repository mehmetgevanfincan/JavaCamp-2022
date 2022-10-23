public class Main {

    public static void main(String[] args) {
        String mesaj = "Vade orani";

        Product product1 = new Product();
        product1.setName("Cam Fincan");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("default1.jpg");

        Product product2 = new Product();
        product2.setName("Porselen Fincan");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("default2.jpg");

        Product product3 = new Product();
        product3.setName("Seramik Fincan");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("default3.jpg");

        Product[] products = { product1, product2, product3 };

        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhoneNumber("05319497956");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Gevan");
        individualCustomer.setLastName("Fincan");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhoneNumber("05335464646");
        corporateCustomer.setTaxNumber("1234567890");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = { individualCustomer, corporateCustomer };

    }

}