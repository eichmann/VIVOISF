package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(otherNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherNameShortARIterator theother = (otherNameShortARIterator)findAncestorWithClass(this, otherNameShortARIterator.class);
			pageContext.getOut().print(theother.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing other for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

