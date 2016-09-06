package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(otherCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherCodeISO2Iterator theother = (otherCodeISO2Iterator)findAncestorWithClass(this, otherCodeISO2Iterator.class);
			pageContext.getOut().print(theother.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing other for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

