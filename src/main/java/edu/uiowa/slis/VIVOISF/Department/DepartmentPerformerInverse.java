package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentPerformerInverseIterator theDepartmentPerformerInverseIterator = (DepartmentPerformerInverseIterator)findAncestorWithClass(this, DepartmentPerformerInverseIterator.class);
			pageContext.getOut().print(theDepartmentPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for performer tag ");
		}
		return SKIP_BODY;
	}
}

