package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameListRUIterator theSpecial_group = (Special_groupNameListRUIterator)findAncestorWithClass(this, Special_groupNameListRUIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

