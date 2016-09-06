package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(otherNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherNameOfficialARIterator theother = (otherNameOfficialARIterator)findAncestorWithClass(this, otherNameOfficialARIterator.class);
			pageContext.getOut().print(theother.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing other for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

