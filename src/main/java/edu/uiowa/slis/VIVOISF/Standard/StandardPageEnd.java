package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardPageEndIterator theStandard = (StandardPageEndIterator)findAncestorWithClass(this, StandardPageEndIterator.class);
			pageContext.getOut().print(theStandard.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

