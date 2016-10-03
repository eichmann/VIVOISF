package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardPages currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardPagesIterator theStandard = (StandardPagesIterator)findAncestorWithClass(this, StandardPagesIterator.class);
			pageContext.getOut().print(theStandard.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for pages tag ");
		}
		return SKIP_BODY;
	}
}

