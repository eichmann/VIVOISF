package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolOwnerInverseIterator theSchoolOwnerInverseIterator = (SchoolOwnerInverseIterator)findAncestorWithClass(this, SchoolOwnerInverseIterator.class);
			pageContext.getOut().print(theSchoolOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for owner tag ");
		}
		return SKIP_BODY;
	}
}

