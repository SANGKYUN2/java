package sale;

import java.sql.*;
import java.util.*;

import product.Database;

public class SaleDAO {
	Connection con = Database.CON;
	
	//매출 등록
	public void insert(SaleVO vo) {
		try {
			String sql = "insert into sale(seq, code, sale_date, qnt, price) ";
			sql += "values(seq_sale.nextval, ?, ?, ?, ?) ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getCode());
			ps.setString(2, vo.getSale_date());
			ps.setInt(3, vo.getQnt());
			ps.setInt(4, vo.getPrice());
			ps.execute();
		}
		catch (Exception e) {
			System.out.println("매출 등록 : " + e.toString());

		}
	}
	//매출현황
	public ArrayList<SaleVO> list(){
		ArrayList<SaleVO> array = new ArrayList<SaleVO>();
		try {
			String sql = "select sale_date, code, name, sum(qnt), sum(price*qnt) total ";
			sql += "from view_sale ";
			sql += "group by sale_date, code, name ";
			sql += "order by sale_date, code";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				SaleVO vo = new SaleVO();
				vo.setSale_date(rs.getString("sale_date"));
				vo.setCode(rs.getString("code"));
				vo.setQnt(rs.getInt("sum(qnt)"));
				vo.setPrice(rs.getInt("total"));
				vo.setName(rs.getString("Name"));
				array.add(vo); 
				
			}
		}
		catch (Exception e) {
			System.out.println("매출현황 : " + e.toString());
		}
		return array;
		
	}
}
