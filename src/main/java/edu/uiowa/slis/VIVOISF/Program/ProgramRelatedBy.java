package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramRelatedByIterator theProgramRelatedByIterator = (ProgramRelatedByIterator)findAncestorWithClass(this, ProgramRelatedByIterator.class);
			pageContext.getOut().print(theProgramRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

