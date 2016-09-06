package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameListRUIterator thespecial_group = (special_groupNameListRUIterator)findAncestorWithClass(this, special_groupNameListRUIterator.class);
			pageContext.getOut().print(thespecial_group.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

