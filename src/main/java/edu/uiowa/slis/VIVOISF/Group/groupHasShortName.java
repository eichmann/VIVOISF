package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHasShortName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHasShortName currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHasShortName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupHasShortNameIterator thegroup = (groupHasShortNameIterator)findAncestorWithClass(this, groupHasShortNameIterator.class);
			pageContext.getOut().print(thegroup.getHasShortName());
		} catch (Exception e) {
			log.error("Can't find enclosing group for hasShortName tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hasShortName tag ");
		}
		return SKIP_BODY;
	}
}

