package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramOwnerInverseIterator theProgramOwnerInverseIterator = (ProgramOwnerInverseIterator)findAncestorWithClass(this, ProgramOwnerInverseIterator.class);
			pageContext.getOut().print(theProgramOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for owner tag ");
		}
		return SKIP_BODY;
	}
}

