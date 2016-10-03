package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(groupValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupValidUntilIterator thegroup = (groupValidUntilIterator)findAncestorWithClass(this, groupValidUntilIterator.class);
			pageContext.getOut().print(thegroup.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing group for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for validUntil tag ");
		}
		return SKIP_BODY;
	}
}

