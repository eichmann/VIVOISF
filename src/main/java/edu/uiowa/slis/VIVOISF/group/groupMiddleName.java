package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupMiddleName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupMiddleName currentInstance = null;
	private static final Log log = LogFactory.getLog(groupMiddleName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupMiddleNameIterator thegroup = (groupMiddleNameIterator)findAncestorWithClass(this, groupMiddleNameIterator.class);
			pageContext.getOut().print(thegroup.getMiddleName());
		} catch (Exception e) {
			log.error("Can't find enclosing group for middleName tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for middleName tag ");
		}
		return SKIP_BODY;
	}
}

