package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupSuffixNameIterator theGroup = (GroupSuffixNameIterator)findAncestorWithClass(this, GroupSuffixNameIterator.class);
			pageContext.getOut().print(theGroup.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

