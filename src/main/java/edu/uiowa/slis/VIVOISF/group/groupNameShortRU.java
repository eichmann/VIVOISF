package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameShortRUIterator thegroup = (groupNameShortRUIterator)findAncestorWithClass(this, groupNameShortRUIterator.class);
			pageContext.getOut().print(thegroup.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

