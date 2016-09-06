package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicRelatedByIterator theNonAcademicRelatedByIterator = (NonAcademicRelatedByIterator)findAncestorWithClass(this, NonAcademicRelatedByIterator.class);
			pageContext.getOut().print(theNonAcademicRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

