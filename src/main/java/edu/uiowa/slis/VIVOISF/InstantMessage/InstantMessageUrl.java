package edu.uiowa.slis.VIVOISF.InstantMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstantMessageUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstantMessageUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(InstantMessageUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstantMessageUrlIterator theInstantMessage = (InstantMessageUrlIterator)findAncestorWithClass(this, InstantMessageUrlIterator.class);
			pageContext.getOut().print(theInstantMessage.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing InstantMessage for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing InstantMessage for url tag ");
		}
		return SKIP_BODY;
	}
}

