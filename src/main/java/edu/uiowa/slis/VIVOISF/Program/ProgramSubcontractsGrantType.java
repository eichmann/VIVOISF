package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramSubcontractsGrantType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramSubcontractsGrantType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramSubcontractsGrantType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramSubcontractsGrantIterator theProgramSubcontractsGrantIterator = (ProgramSubcontractsGrantIterator)findAncestorWithClass(this, ProgramSubcontractsGrantIterator.class);
			pageContext.getOut().print(theProgramSubcontractsGrantIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

