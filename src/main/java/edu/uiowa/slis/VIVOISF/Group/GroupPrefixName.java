package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupPrefixNameIterator theGroup = (GroupPrefixNameIterator)findAncestorWithClass(this, GroupPrefixNameIterator.class);
			pageContext.getOut().print(theGroup.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

