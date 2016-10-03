package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolPerformerInverseIterator theSchoolPerformerInverseIterator = (SchoolPerformerInverseIterator)findAncestorWithClass(this, SchoolPerformerInverseIterator.class);
			pageContext.getOut().print(theSchoolPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for performer tag ");
		}
		return SKIP_BODY;
	}
}

