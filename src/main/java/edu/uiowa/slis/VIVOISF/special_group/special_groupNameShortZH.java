package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameShortZHIterator thespecial_group = (special_groupNameShortZHIterator)findAncestorWithClass(this, special_groupNameShortZHIterator.class);
			pageContext.getOut().print(thespecial_group.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

