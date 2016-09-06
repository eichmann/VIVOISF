package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedGeographicFocusOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedGeographicFocusOf currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedGeographicFocusOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			disputedGeographicFocusOfIterator thedisputedGeographicFocusOfIterator = (disputedGeographicFocusOfIterator)findAncestorWithClass(this, disputedGeographicFocusOfIterator.class);
			pageContext.getOut().print(thedisputedGeographicFocusOfIterator.getGeographicFocusOf());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

