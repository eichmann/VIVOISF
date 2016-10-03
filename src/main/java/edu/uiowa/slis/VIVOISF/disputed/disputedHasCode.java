package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedHasCode extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedHasCode currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedHasCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			disputedHasCodeIterator thedisputed = (disputedHasCodeIterator)findAncestorWithClass(this, disputedHasCodeIterator.class);
			pageContext.getOut().print(thedisputed.getHasCode());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for hasCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for hasCode tag ");
		}
		return SKIP_BODY;
	}
}

