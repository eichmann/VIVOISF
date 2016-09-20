package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramIssuerInverseIterator theProgramIssuerInverseIterator = (ProgramIssuerInverseIterator)findAncestorWithClass(this, ProgramIssuerInverseIterator.class);
			pageContext.getOut().print(theProgramIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for issuer tag ");
		}
		return SKIP_BODY;
	}
}

