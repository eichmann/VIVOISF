package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionCodeUNIterator thePrimaryPosition = (PrimaryPositionCodeUNIterator)findAncestorWithClass(this, PrimaryPositionCodeUNIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

