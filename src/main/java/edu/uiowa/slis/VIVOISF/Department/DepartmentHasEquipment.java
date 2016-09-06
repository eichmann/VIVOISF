package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentHasEquipment extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentHasEquipment currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentHasEquipment.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentHasEquipmentIterator theDepartmentHasEquipmentIterator = (DepartmentHasEquipmentIterator)findAncestorWithClass(this, DepartmentHasEquipmentIterator.class);
			pageContext.getOut().print(theDepartmentHasEquipmentIterator.getHasEquipment());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

