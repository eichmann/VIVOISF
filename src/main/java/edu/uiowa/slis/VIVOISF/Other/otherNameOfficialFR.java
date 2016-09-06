package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(otherNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherNameOfficialFRIterator theother = (otherNameOfficialFRIterator)findAncestorWithClass(this, otherNameOfficialFRIterator.class);
			pageContext.getOut().print(theother.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing other for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

