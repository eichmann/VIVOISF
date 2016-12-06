package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionCodeISO2Iterator thePrimaryPosition = (PrimaryPositionCodeISO2Iterator)findAncestorWithClass(this, PrimaryPositionCodeISO2Iterator.class);
			pageContext.getOut().print(thePrimaryPosition.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

