package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameListITIterator thegroup = (groupNameListITIterator)findAncestorWithClass(this, groupNameListITIterator.class);
			pageContext.getOut().print(thegroup.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

