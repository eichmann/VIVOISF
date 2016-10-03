package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardPageStartIterator theStandard = (StandardPageStartIterator)findAncestorWithClass(this, StandardPageStartIterator.class);
			pageContext.getOut().print(theStandard.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

