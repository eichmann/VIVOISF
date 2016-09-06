package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentPublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentPublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentPublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentPublisherOfIterator theDepartmentPublisherOfIterator = (DepartmentPublisherOfIterator)findAncestorWithClass(this, DepartmentPublisherOfIterator.class);
			pageContext.getOut().print(theDepartmentPublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

