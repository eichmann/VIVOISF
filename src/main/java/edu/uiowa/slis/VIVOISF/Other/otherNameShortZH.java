package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(otherNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherNameShortZHIterator theother = (otherNameShortZHIterator)findAncestorWithClass(this, otherNameShortZHIterator.class);
			pageContext.getOut().print(theother.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing other for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

