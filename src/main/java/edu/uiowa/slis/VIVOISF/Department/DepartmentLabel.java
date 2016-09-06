package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Department theDepartment = (Department)findAncestorWithClass(this, Department.class);
			if (!theDepartment.commitNeeded) {
				pageContext.getOut().print(theDepartment.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Department for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Department theDepartment = (Department)findAncestorWithClass(this, Department.class);
			return theDepartment.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Department for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Department theDepartment = (Department)findAncestorWithClass(this, Department.class);
			theDepartment.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Department for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for label tag ");
		}
	}
}

