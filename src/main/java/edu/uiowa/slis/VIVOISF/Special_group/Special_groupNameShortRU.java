package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameShortRUIterator theSpecial_group = (Special_groupNameShortRUIterator)findAncestorWithClass(this, Special_groupNameShortRUIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

