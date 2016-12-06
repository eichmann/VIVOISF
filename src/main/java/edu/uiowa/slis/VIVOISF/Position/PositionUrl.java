package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionUrlIterator thePosition = (PositionUrlIterator)findAncestorWithClass(this, PositionUrlIterator.class);
			pageContext.getOut().print(thePosition.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for url tag ");
		}
		return SKIP_BODY;
	}
}

