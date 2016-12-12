package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupValidUntilIterator theGroup = (GroupValidUntilIterator)findAncestorWithClass(this, GroupValidUntilIterator.class);
			pageContext.getOut().print(theGroup.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for validUntil tag ");
		}
		return SKIP_BODY;
	}
}

