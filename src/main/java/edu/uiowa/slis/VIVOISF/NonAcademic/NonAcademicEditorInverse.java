package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicEditorInverseIterator theNonAcademicEditorInverseIterator = (NonAcademicEditorInverseIterator)findAncestorWithClass(this, NonAcademicEditorInverseIterator.class);
			pageContext.getOut().print(theNonAcademicEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for editor tag ");
		}
		return SKIP_BODY;
	}
}

