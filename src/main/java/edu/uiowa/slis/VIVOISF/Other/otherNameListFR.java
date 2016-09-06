package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(otherNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherNameListFRIterator theother = (otherNameListFRIterator)findAncestorWithClass(this, otherNameListFRIterator.class);
			pageContext.getOut().print(theother.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing other for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

