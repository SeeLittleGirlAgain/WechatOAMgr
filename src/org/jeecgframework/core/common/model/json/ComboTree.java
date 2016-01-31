package org.jeecgframework.core.common.model.json;

import java.util.List;
import java.util.Map;


public class ComboTree implements java.io.Serializable {

	private String id;
	private String text;// ���ڵ�����
	private String iconCls;// ǰ���Сͼ����ʽ
	private Boolean checked = false;// �Ƿ�ѡ״̬
	private Map<String, Object> attributes;// ��������
	private List<ComboTree> children;// �ӽڵ�
	private String state = "open";// �Ƿ�չ��(open,closed)

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	public List<ComboTree> getChildren() {
		return children;
	}

	public void setChildren(List<ComboTree> children) {
		this.children = children;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}
}
