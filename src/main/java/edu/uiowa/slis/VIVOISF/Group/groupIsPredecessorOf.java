package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupIsPredecessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupIsPredecessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(groupIsPredecessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupIsPredecessorOfIterator thegroupIsPredecessorOfIterator = (groupIsPredecessorOfIterator)findAncestorWithClass(this, groupIsPredecessorOfIterator.class);
			pageContext.getOut().print(thegroupIsPredecessorOfIterator.getIsPredecessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing group for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}

