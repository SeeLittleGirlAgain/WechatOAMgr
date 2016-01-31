package org.jeecgframework.core.common.model.json;

import java.util.List;

import org.jeecgframework.core.util.ContextHolderUtils;
import org.jeecgframework.core.util.ResourceUtil;
import org.jeecgframework.tag.vo.datatable.SortDirection;


/**
 * easyui��datagrid���̨���ݲ���ʹ�õ�model
 * 
 * @author
 * 
 */
public class DataGrid {

	private int page = 1;// ��ǰҳ
	private int rows = 10;// ÿҳ��ʾ��¼��
	private String sort = null;// �����ֶ���
	private SortDirection order = SortDirection.asc;// ��ʲô����(asc,desc)
	private String field;//�ֶ�
	private String treefield;//�������ݱ��ı��ֶ�
	private List results;// �����
	private int total;//�ܼ�¼��
	private String footer;//�ϼ���
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getField() {
		return field;
	}

	public List getResults() {
		return results;
	}

	public void setResults(List results) {
		this.results = results;
	}

	public void setField(String field) {
		this.field = field;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		if(ContextHolderUtils.getRequest()!=null&&ResourceUtil.getParameter("rows")!=null){
			return rows;
		}
		return 10000;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public SortDirection getOrder() {
		return order;
	}

	public void setOrder(SortDirection order) {
		this.order = order;
	}
	public String getTreefield() {
		return treefield;
	}

	public void setTreefield(String treefield) {
		this.treefield = treefield;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}
	
}
