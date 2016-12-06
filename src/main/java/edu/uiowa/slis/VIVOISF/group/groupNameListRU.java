package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameListRUIterator thegroup = (groupNameListRUIterator)findAncestorWithClass(this, groupNameListRUIterator.class);
			pageContext.getOut().print(thegroup.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

