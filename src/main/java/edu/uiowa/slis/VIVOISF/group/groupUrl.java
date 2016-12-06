package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(groupUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupUrlIterator thegroup = (groupUrlIterator)findAncestorWithClass(this, groupUrlIterator.class);
			pageContext.getOut().print(thegroup.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing group for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for url tag ");
		}
		return SKIP_BODY;
	}
}

