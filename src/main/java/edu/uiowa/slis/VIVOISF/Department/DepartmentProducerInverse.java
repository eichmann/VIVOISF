package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentProducerInverseIterator theDepartmentProducerInverseIterator = (DepartmentProducerInverseIterator)findAncestorWithClass(this, DepartmentProducerInverseIterator.class);
			pageContext.getOut().print(theDepartmentProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for producer tag ");
		}
		return SKIP_BODY;
	}
}

