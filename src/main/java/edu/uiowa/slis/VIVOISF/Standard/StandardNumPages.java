package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardNumPagesIterator theStandard = (StandardNumPagesIterator)findAncestorWithClass(this, StandardNumPagesIterator.class);
			pageContext.getOut().print(theStandard.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for numPages tag ");
		}
		return SKIP_BODY;
	}
}

