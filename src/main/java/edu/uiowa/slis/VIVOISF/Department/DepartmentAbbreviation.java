package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Department theDepartment = (Department)findAncestorWithClass(this, Department.class);
			if (!theDepartment.commitNeeded) {
				pageContext.getOut().print(theDepartment.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Department for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Department theDepartment = (Department)findAncestorWithClass(this, Department.class);
			return theDepartment.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Department for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Department theDepartment = (Department)findAncestorWithClass(this, Department.class);
			theDepartment.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Department for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for abbreviation tag ");
		}
	}
}

