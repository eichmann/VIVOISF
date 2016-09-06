package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentSponsors extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentSponsors currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentSponsors.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentSponsorsIterator theDepartmentSponsorsIterator = (DepartmentSponsorsIterator)findAncestorWithClass(this, DepartmentSponsorsIterator.class);
			pageContext.getOut().print(theDepartmentSponsorsIterator.getSponsors());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

