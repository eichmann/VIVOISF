package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameShortRUIterator theGroup = (GroupNameShortRUIterator)findAncestorWithClass(this, GroupNameShortRUIterator.class);
			pageContext.getOut().print(theGroup.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

