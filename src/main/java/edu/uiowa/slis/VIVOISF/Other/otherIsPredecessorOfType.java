package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherIsPredecessorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherIsPredecessorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(otherIsPredecessorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			otherIsPredecessorOfIterator theotherIsPredecessorOfIterator = (otherIsPredecessorOfIterator)findAncestorWithClass(this, otherIsPredecessorOfIterator.class);
			pageContext.getOut().print(theotherIsPredecessorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing other for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}

