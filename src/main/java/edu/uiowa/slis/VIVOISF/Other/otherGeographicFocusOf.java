package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherGeographicFocusOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherGeographicFocusOf currentInstance = null;
	private static final Log log = LogFactory.getLog(otherGeographicFocusOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			otherGeographicFocusOfIterator theotherGeographicFocusOfIterator = (otherGeographicFocusOfIterator)findAncestorWithClass(this, otherGeographicFocusOfIterator.class);
			pageContext.getOut().print(theotherGeographicFocusOfIterator.getGeographicFocusOf());
		} catch (Exception e) {
			log.error("Can't find enclosing other for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

