package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameListZHIterator thespecial_group = (special_groupNameListZHIterator)findAncestorWithClass(this, special_groupNameListZHIterator.class);
			pageContext.getOut().print(thespecial_group.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

