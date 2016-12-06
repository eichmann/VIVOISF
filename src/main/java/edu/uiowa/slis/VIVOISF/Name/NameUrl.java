package edu.uiowa.slis.VIVOISF.Name;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NameUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NameUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(NameUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NameUrlIterator theName = (NameUrlIterator)findAncestorWithClass(this, NameUrlIterator.class);
			pageContext.getOut().print(theName.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Name for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for url tag ");
		}
		return SKIP_BODY;
	}
}

