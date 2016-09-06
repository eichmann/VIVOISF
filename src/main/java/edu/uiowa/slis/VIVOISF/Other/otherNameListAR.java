package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(otherNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherNameListARIterator theother = (otherNameListARIterator)findAncestorWithClass(this, otherNameListARIterator.class);
			pageContext.getOut().print(theother.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing other for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

