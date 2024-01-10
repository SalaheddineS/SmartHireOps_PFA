package com.example.gestiondesrh.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class testController {



//
//    ProductService productService;
//    ProductRepository productRepository;
//    @RequestMapping(path="/products",method = RequestMethod.GET)
//    public List<ProductDTO> getProducts()throws ProductNotFoundException{
//        return productService.getProductDTOS();
//    }
//    @RequestMapping(path="/products/{id}",method = RequestMethod.GET)
//    public ProductDTO getProductById(@PathVariable(name = "id") Long productId)throws ProductNotFoundException{
//        return productService.getProductDTO(productId);
//    }
//    @GetMapping(value = "/products/search/{categoryId}",params = "keyword")
//    public List<ProductDTO> getProductByKeyWord(@PathVariable Long categoryId,@RequestParam(name = "keyword" , defaultValue = "")String keyword)throws ProductNotFoundException {
//        return productService.productsByKeyword(categoryId,keyword);
//    }
//    @RequestMapping(path="/products/search",params = "categoryId", method = RequestMethod.GET)
//    public List<ProductDTO> getProductsByCategory(@RequestParam(name = "categoryId") Long categoryId) {
//        return productService.productsByCategory(categoryId);
//    }
//    @RequestMapping(value = "/products/search",params = "currentPrice", method = RequestMethod.GET)
//    public List<ProductDTO> getProductByKeyPrice(@RequestParam(name = "currentPrice",defaultValue = "0")double currentPrice)throws ProductNotFoundException {
//        return productService.getProductsByPrice(currentPrice);
//    }
//
//    @RequestMapping(path="/products/{productId}",method = RequestMethod.PATCH)
//    public ProductDTO updateProduct(@PathVariable Long productId , @RequestBody ProductDTO productDTO) throws ProductNotFoundException{
//        productDTO.setId(productId);
//        return productService.updateProduct(productDTO);
//    }
//    @DeleteMapping("/products/{id}")
//    public void deleteProduct(@PathVariable Long id) throws ProductNotFoundException {
//        productService.deleteProduct(id);
//    }
//
//    @RequestMapping(path="/products/search",params ="selected",method = RequestMethod.GET)
//    public List<ProductDTO> getSelectedProducts(@RequestParam(name = "selected",defaultValue = "false") Boolean selected){
//        return productService.productsSelected(selected);
//    }
//
//    @GetMapping("/products/sortedBy/{field}") // field can be price ,date ....
//    private List<ProductDTO> getProductsWithSort(@PathVariable String field){
//        return  productService.findProductWithSorting(field);
//    }
//    @GetMapping("/products/pagination/{categoryId}")
//    private List<ProductDTO> getProductsWithPagination(@PathVariable Long categoryId ,
//                                                       @RequestParam(name = "offset",defaultValue = "0") int offset,
//                                                       @RequestParam(name = "pageSize",defaultValue = "9") int pageSize)throws ProductNotFoundException{
//        return productService.findProductWithPagination(categoryId,offset,pageSize);
//    }
//
//    @GetMapping(path = "products/photoProduct/{productId}",produces = MediaType.IMAGE_PNG_VALUE)
//    public byte[] getPhoto(@PathVariable(name = "productId") Long productId) throws Exception{
//        ProductDTO  p = productService.getProductDTO(productId);
//        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/ismail-ecom/products/"+p.getPhoto()));
//    }
//
//
//    @PostMapping(path = "/uploadPhoto/{id}")
//    public void uploadPhoto(MultipartFile file, @PathVariable Long id) throws Exception{
//        Product p=productRepository.findById(id).get();
//        String type=file.getContentType().substring(6);
//        System.out.println(type);
//        if(type.equals("png")||type.equals("jpg")||type.equals("jpeg")){
//            p.setPhoto(p.getId().toString()+"."+type);
//        }
//        Files.write(Paths.get(System.getProperty("user.home")+"/ismail-ecom/products/"+p.getPhoto()),file.getBytes());
//        productRepository.save(p);
//    }
//    @PostMapping("/products/{categoryId}")
//    public ProductDTO addNewProduct(@RequestBody ProductDTO product,@PathVariable Long categoryId){
//        return this.productService.addProduct(product,categoryId);
//    }




}
