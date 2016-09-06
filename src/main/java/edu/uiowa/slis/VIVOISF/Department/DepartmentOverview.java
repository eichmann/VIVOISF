package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Department theDepartment = (Department)findAncestorWithClass(this, Department.class);
			if (!theDepartment.commitNeeded) {
				pageContext.getOut().print(theDepartment.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Department for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Department theDepartment = (Department)findAncestorWithClass(this, Department.class);
			return theDepartment.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Department for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Department theDepartment = (Department)findAncestorWithClass(this, Department.class);
			theDepartment.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Department for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for overview tag ");
		}
	}
}

