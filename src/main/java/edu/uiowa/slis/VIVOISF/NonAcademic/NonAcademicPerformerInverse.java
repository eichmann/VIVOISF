package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPerformerInverseIterator theNonAcademicPerformerInverseIterator = (NonAcademicPerformerInverseIterator)findAncestorWithClass(this, NonAcademicPerformerInverseIterator.class);
			pageContext.getOut().print(theNonAcademicPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for performer tag ");
		}
		return SKIP_BODY;
	}
}

