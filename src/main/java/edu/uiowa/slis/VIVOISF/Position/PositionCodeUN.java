package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionCodeUNIterator thePosition = (PositionCodeUNIterator)findAncestorWithClass(this, PositionCodeUNIterator.class);
			pageContext.getOut().print(thePosition.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

