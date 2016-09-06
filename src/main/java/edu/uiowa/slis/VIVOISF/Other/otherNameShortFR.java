package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(otherNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherNameShortFRIterator theother = (otherNameShortFRIterator)findAncestorWithClass(this, otherNameShortFRIterator.class);
			pageContext.getOut().print(theother.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing other for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

