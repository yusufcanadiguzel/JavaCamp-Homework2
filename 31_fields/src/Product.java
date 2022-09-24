public class Product {

    private int _id;
    private String _name;
    private int _unitsInStock;
    private double _unitPrice;
    private String _code;

    public Product() {
    }

    public Product(int id, String name, int unitsInStock, double unitPrice) {
        _id = id;
        _name = name;
        _unitsInStock = unitsInStock;
        _unitPrice = unitPrice;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public int getUnitsInStock() {
        return _unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        _unitsInStock = unitsInStock;
    }

    public double getUnitPrice() {
        return _unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        _unitPrice = unitPrice;
    }

    public String getCode() {
        _code = _id + "-" + _name.substring(0, 1);
        
        return _code;
    }

    /* public void setCode(String code) {
        _code = code;
    } */

}
