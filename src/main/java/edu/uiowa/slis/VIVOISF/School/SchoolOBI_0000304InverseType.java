package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolOBI_0000304InverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolOBI_0000304InverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolOBI_0000304InverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolOBI_0000304InverseIterator theSchoolOBI_0000304InverseIterator = (SchoolOBI_0000304InverseIterator)findAncestorWithClass(this, SchoolOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theSchoolOBI_0000304InverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

