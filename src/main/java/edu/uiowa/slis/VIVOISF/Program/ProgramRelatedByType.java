package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramRelatedByIterator theProgramRelatedByIterator = (ProgramRelatedByIterator)findAncestorWithClass(this, ProgramRelatedByIterator.class);
			pageContext.getOut().print(theProgramRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

