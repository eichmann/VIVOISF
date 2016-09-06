package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameShortRUIterator thespecial_group = (special_groupNameShortRUIterator)findAncestorWithClass(this, special_groupNameShortRUIterator.class);
			pageContext.getOut().print(thespecial_group.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

