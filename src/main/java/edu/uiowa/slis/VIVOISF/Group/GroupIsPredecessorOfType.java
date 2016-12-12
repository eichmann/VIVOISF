package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupIsPredecessorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupIsPredecessorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupIsPredecessorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupIsPredecessorOfIterator theGroupIsPredecessorOfIterator = (GroupIsPredecessorOfIterator)findAncestorWithClass(this, GroupIsPredecessorOfIterator.class);
			pageContext.getOut().print(theGroupIsPredecessorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}

