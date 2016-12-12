package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameListZHIterator theSpecial_group = (Special_groupNameListZHIterator)findAncestorWithClass(this, Special_groupNameListZHIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

