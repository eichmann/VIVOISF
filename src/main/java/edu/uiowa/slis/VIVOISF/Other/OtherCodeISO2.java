package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherCodeISO2Iterator theOther = (OtherCodeISO2Iterator)findAncestorWithClass(this, OtherCodeISO2Iterator.class);
			pageContext.getOut().print(theOther.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

