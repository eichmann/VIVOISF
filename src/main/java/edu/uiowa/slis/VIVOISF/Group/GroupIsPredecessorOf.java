package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupIsPredecessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupIsPredecessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupIsPredecessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupIsPredecessorOfIterator theGroupIsPredecessorOfIterator = (GroupIsPredecessorOfIterator)findAncestorWithClass(this, GroupIsPredecessorOfIterator.class);
			pageContext.getOut().print(theGroupIsPredecessorOfIterator.getIsPredecessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}

