package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedIsPredecessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedIsPredecessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedIsPredecessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			disputedIsPredecessorOfIterator thedisputedIsPredecessorOfIterator = (disputedIsPredecessorOfIterator)findAncestorWithClass(this, disputedIsPredecessorOfIterator.class);
			pageContext.getOut().print(thedisputedIsPredecessorOfIterator.getIsPredecessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}

