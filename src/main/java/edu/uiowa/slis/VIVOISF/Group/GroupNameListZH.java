package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameListZHIterator theGroup = (GroupNameListZHIterator)findAncestorWithClass(this, GroupNameListZHIterator.class);
			pageContext.getOut().print(theGroup.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

