package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionCodeISO2Iterator thePosition = (PositionCodeISO2Iterator)findAncestorWithClass(this, PositionCodeISO2Iterator.class);
			pageContext.getOut().print(thePosition.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

