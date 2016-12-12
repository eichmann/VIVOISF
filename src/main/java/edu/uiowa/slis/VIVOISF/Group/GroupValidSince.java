package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupValidSinceIterator theGroup = (GroupValidSinceIterator)findAncestorWithClass(this, GroupValidSinceIterator.class);
			pageContext.getOut().print(theGroup.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for validSince tag ");
		}
		return SKIP_BODY;
	}
}

