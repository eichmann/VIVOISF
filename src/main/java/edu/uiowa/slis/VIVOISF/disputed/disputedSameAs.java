package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedSameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			disputedSameAsIterator thedisputed = (disputedSameAsIterator)findAncestorWithClass(this, disputedSameAsIterator.class);
			pageContext.getOut().print(thedisputed.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

