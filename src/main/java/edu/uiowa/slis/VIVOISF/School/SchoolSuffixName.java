package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SchoolSuffixNameIterator theSchool = (SchoolSuffixNameIterator)findAncestorWithClass(this, SchoolSuffixNameIterator.class);
			pageContext.getOut().print(theSchool.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing School for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

