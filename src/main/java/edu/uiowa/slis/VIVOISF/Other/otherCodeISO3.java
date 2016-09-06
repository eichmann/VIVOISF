package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(otherCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherCodeISO3Iterator theother = (otherCodeISO3Iterator)findAncestorWithClass(this, otherCodeISO3Iterator.class);
			pageContext.getOut().print(theother.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing other for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

