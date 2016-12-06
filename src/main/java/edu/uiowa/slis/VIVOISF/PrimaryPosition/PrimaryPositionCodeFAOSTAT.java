package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionCodeFAOSTATIterator thePrimaryPosition = (PrimaryPositionCodeFAOSTATIterator)findAncestorWithClass(this, PrimaryPositionCodeFAOSTATIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

