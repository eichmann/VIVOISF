package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameListARIterator thegroup = (groupNameListARIterator)findAncestorWithClass(this, groupNameListARIterator.class);
			pageContext.getOut().print(thegroup.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

