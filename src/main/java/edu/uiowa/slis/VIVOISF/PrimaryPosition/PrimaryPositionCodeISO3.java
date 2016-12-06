package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionCodeISO3Iterator thePrimaryPosition = (PrimaryPositionCodeISO3Iterator)findAncestorWithClass(this, PrimaryPositionCodeISO3Iterator.class);
			pageContext.getOut().print(thePrimaryPosition.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

