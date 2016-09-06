package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicRelatedByIterator theNonAcademicRelatedByIterator = (NonAcademicRelatedByIterator)findAncestorWithClass(this, NonAcademicRelatedByIterator.class);
			pageContext.getOut().print(theNonAcademicRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

