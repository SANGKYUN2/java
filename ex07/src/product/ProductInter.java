package product;

import java.util.*;

public interface ProductInter {
	public ArrayList<ProductVO> list();
	public void insert(ProductVO vo);
	public boolean delete(String code);
	public void update(ProductVO vo);
	public ProductVO read(String code);
	public String getCode();
	
}
