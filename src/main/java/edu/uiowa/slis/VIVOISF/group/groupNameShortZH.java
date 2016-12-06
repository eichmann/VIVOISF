package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameShortZHIterator thegroup = (groupNameShortZHIterator)findAncestorWithClass(this, groupNameShortZHIterator.class);
			pageContext.getOut().print(thegroup.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

