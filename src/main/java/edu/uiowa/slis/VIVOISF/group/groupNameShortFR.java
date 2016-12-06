package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameShortFRIterator thegroup = (groupNameShortFRIterator)findAncestorWithClass(this, groupNameShortFRIterator.class);
			pageContext.getOut().print(thegroup.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

