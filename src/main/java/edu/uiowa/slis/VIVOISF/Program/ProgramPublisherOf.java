package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramPublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramPublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramPublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramPublisherOfIterator theProgramPublisherOfIterator = (ProgramPublisherOfIterator)findAncestorWithClass(this, ProgramPublisherOfIterator.class);
			pageContext.getOut().print(theProgramPublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

