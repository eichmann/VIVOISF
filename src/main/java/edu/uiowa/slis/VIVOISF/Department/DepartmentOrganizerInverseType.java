package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentOrganizerInverseIterator theDepartmentOrganizerInverseIterator = (DepartmentOrganizerInverseIterator)findAncestorWithClass(this, DepartmentOrganizerInverseIterator.class);
			pageContext.getOut().print(theDepartmentOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for organizer tag ");
		}
		return SKIP_BODY;
	}
}

