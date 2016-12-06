package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionCodeUNDPIterator thePosition = (PositionCodeUNDPIterator)findAncestorWithClass(this, PositionCodeUNDPIterator.class);
			pageContext.getOut().print(thePosition.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

