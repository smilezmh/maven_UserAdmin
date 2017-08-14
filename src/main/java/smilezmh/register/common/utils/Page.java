package smilezmh.register.common.utils;

import java.util.List;

public class Page<T> {
    
	private int total;//符合查询条件总条数
	private int page=1;//当前页
	private int size;//每页显示数
	private int startRow;
    private List<T> rows;//每页显示对象（List）
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	
    
}
