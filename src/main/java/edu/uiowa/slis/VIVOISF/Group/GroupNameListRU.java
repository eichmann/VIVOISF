package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameListRUIterator theGroup = (GroupNameListRUIterator)findAncestorWithClass(this, GroupNameListRUIterator.class);
			pageContext.getOut().print(theGroup.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

