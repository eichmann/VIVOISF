package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameListZHIterator thegroup = (groupNameListZHIterator)findAncestorWithClass(this, groupNameListZHIterator.class);
			pageContext.getOut().print(thegroup.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

