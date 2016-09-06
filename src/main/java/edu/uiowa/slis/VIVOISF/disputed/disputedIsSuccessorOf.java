package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedIsSuccessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedIsSuccessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedIsSuccessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			disputedIsSuccessorOfIterator thedisputedIsSuccessorOfIterator = (disputedIsSuccessorOfIterator)findAncestorWithClass(this, disputedIsSuccessorOfIterator.class);
			pageContext.getOut().print(thedisputedIsSuccessorOfIterator.getIsSuccessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}

