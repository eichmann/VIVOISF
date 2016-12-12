package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameShortZHIterator theGroup = (GroupNameShortZHIterator)findAncestorWithClass(this, GroupNameShortZHIterator.class);
			pageContext.getOut().print(theGroup.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

