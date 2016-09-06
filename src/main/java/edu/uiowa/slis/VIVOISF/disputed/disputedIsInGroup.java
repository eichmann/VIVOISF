package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedIsInGroup extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedIsInGroup currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedIsInGroup.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			disputedIsInGroupIterator thedisputedIsInGroupIterator = (disputedIsInGroupIterator)findAncestorWithClass(this, disputedIsInGroupIterator.class);
			pageContext.getOut().print(thedisputedIsInGroupIterator.getIsInGroup());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for isInGroup tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for isInGroup tag ");
		}
		return SKIP_BODY;
	}
}

