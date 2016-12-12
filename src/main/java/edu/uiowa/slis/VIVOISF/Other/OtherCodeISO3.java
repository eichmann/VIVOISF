package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherCodeISO3Iterator theOther = (OtherCodeISO3Iterator)findAncestorWithClass(this, OtherCodeISO3Iterator.class);
			pageContext.getOut().print(theOther.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

