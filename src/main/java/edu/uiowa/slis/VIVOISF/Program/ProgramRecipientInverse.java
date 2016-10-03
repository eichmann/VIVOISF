package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramRecipientInverseIterator theProgramRecipientInverseIterator = (ProgramRecipientInverseIterator)findAncestorWithClass(this, ProgramRecipientInverseIterator.class);
			pageContext.getOut().print(theProgramRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for recipient tag ");
		}
		return SKIP_BODY;
	}
}

