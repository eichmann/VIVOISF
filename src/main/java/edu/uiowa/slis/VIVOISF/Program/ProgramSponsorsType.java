package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramSponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramSponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramSponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramSponsorsIterator theProgramSponsorsIterator = (ProgramSponsorsIterator)findAncestorWithClass(this, ProgramSponsorsIterator.class);
			pageContext.getOut().print(theProgramSponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

