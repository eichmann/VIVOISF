package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionCodeUNDPIterator thePrimaryPosition = (PrimaryPositionCodeUNDPIterator)findAncestorWithClass(this, PrimaryPositionCodeUNDPIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

