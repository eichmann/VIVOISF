package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(groupValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupValidSinceIterator thegroup = (groupValidSinceIterator)findAncestorWithClass(this, groupValidSinceIterator.class);
			pageContext.getOut().print(thegroup.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing group for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for validSince tag ");
		}
		return SKIP_BODY;
	}
}

