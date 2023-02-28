import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import java.util.ArrayList;
import java.util.List;
public class Books {
    private String name;
    private Integer price;

    public Books(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public static List<Books> getBookList(Integer quantity) {
        List<Books> bookList = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            bookList.add(new Books(RandomStringUtils.randomAlphabetic(2, 15), RandomUtils.nextInt(1, 99)));
        }
        return bookList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price;
    }
}