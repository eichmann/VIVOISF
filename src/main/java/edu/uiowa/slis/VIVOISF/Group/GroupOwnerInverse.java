package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupOwnerInverseIterator theGroupOwnerInverseIterator = (GroupOwnerInverseIterator)findAncestorWithClass(this, GroupOwnerInverseIterator.class);
			pageContext.getOut().print(theGroupOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for owner tag ");
		}
		return SKIP_BODY;
	}
}

