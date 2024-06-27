package com.redzone.blog.client;

    import javax.validation.constraints.*;
    import java.io.Serializable;
    import java.math.BigDecimal;


public class ProductFeignDTO implements Serializable {

    private Long id;

    @NotNull
    private String title;

    @NotNull
    @DecimalMin(value = "0")
    private BigDecimal price;

    private byte[] image;

    private String imageContentType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getImageContentType() {
        return imageContentType;
    }

    public void setImageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProductFeignDTO)) {
            return false;
        }

        return id != null && id.equals(((ProductFeignDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", price=" + price +
            ", image='" + image + '\'' +
            ", imageContentType='" + imageContentType + '\'' +
            '}';
    }
}
