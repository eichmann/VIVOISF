package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentRecipientInverseIterator theDepartmentRecipientInverseIterator = (DepartmentRecipientInverseIterator)findAncestorWithClass(this, DepartmentRecipientInverseIterator.class);
			pageContext.getOut().print(theDepartmentRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for recipient tag ");
		}
		return SKIP_BODY;
	}
}

