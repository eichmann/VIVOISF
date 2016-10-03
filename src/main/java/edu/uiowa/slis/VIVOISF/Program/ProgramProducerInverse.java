package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramProducerInverseIterator theProgramProducerInverseIterator = (ProgramProducerInverseIterator)findAncestorWithClass(this, ProgramProducerInverseIterator.class);
			pageContext.getOut().print(theProgramProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for producer tag ");
		}
		return SKIP_BODY;
	}
}

