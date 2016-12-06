package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280DateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280DateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280DateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280DateTimeValueIterator theUO_0000280DateTimeValueIterator = (UO_0000280DateTimeValueIterator)findAncestorWithClass(this, UO_0000280DateTimeValueIterator.class);
			pageContext.getOut().print(theUO_0000280DateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

