package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionUrlIterator thePrimaryPosition = (PrimaryPositionUrlIterator)findAncestorWithClass(this, PrimaryPositionUrlIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for url tag ");
		}
		return SKIP_BODY;
	}
}

