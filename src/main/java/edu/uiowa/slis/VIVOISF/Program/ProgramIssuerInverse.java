package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramIssuerInverseIterator theProgramIssuerInverseIterator = (ProgramIssuerInverseIterator)findAncestorWithClass(this, ProgramIssuerInverseIterator.class);
			pageContext.getOut().print(theProgramIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for issuer tag ");
		}
		return SKIP_BODY;
	}
}

