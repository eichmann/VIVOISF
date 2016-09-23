package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicSameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicSameAsIterator theNonAcademic = (NonAcademicSameAsIterator)findAncestorWithClass(this, NonAcademicSameAsIterator.class);
			pageContext.getOut().print(theNonAcademic.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

