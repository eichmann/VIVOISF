package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280DateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280DateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280DateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280DateTimeIntervalIterator theUO_0000280DateTimeIntervalIterator = (UO_0000280DateTimeIntervalIterator)findAncestorWithClass(this, UO_0000280DateTimeIntervalIterator.class);
			pageContext.getOut().print(theUO_0000280DateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

