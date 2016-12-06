package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameListFRIterator thegroup = (groupNameListFRIterator)findAncestorWithClass(this, groupNameListFRIterator.class);
			pageContext.getOut().print(thegroup.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

