package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionCodeISO3Iterator thePosition = (PositionCodeISO3Iterator)findAncestorWithClass(this, PositionCodeISO3Iterator.class);
			pageContext.getOut().print(thePosition.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

