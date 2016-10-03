package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolPerformerInverseIterator theSchoolPerformerInverseIterator = (SchoolPerformerInverseIterator)findAncestorWithClass(this, SchoolPerformerInverseIterator.class);
			pageContext.getOut().print(theSchoolPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing School for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for performer tag ");
		}
		return SKIP_BODY;
	}
}

