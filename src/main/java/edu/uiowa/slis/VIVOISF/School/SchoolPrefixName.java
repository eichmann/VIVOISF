package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SchoolPrefixNameIterator theSchool = (SchoolPrefixNameIterator)findAncestorWithClass(this, SchoolPrefixNameIterator.class);
			pageContext.getOut().print(theSchool.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing School for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

