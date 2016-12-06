package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameListESIterator thegroup = (groupNameListESIterator)findAncestorWithClass(this, groupNameListESIterator.class);
			pageContext.getOut().print(thegroup.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

