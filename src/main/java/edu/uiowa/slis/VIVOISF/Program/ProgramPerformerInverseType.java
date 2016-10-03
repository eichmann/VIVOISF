package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramPerformerInverseIterator theProgramPerformerInverseIterator = (ProgramPerformerInverseIterator)findAncestorWithClass(this, ProgramPerformerInverseIterator.class);
			pageContext.getOut().print(theProgramPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for performer tag ");
		}
		return SKIP_BODY;
	}
}

