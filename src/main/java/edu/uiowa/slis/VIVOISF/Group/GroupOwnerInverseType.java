package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupOwnerInverseIterator theGroupOwnerInverseIterator = (GroupOwnerInverseIterator)findAncestorWithClass(this, GroupOwnerInverseIterator.class);
			pageContext.getOut().print(theGroupOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for owner tag ");
		}
		return SKIP_BODY;
	}
}

