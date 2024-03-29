package com.bdqn.springcloud.entity;

public class Product {
    private Long  pid;   //主键

    private String  productName;   //产品名称

    // 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    private String  dbSource;

    public Product(Long pid, String productName, String dbSource) {
        this.pid = pid;
        this.productName = productName;
        this.dbSource = dbSource;
    }

    public Product() {
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    public Long getPid() {
        return pid;
    }

    public String getProductName() {
        return productName;
    }

    public String getDbSource() {
        return dbSource;
    }
}
