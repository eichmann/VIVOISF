package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionCodeFAOSTATIterator thePosition = (PositionCodeFAOSTATIterator)findAncestorWithClass(this, PositionCodeFAOSTATIterator.class);
			pageContext.getOut().print(thePosition.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

