package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameListESIterator thespecial_group = (special_groupNameListESIterator)findAncestorWithClass(this, special_groupNameListESIterator.class);
			pageContext.getOut().print(thespecial_group.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

