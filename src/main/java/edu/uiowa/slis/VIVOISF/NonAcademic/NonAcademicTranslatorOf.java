package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicTranslatorOfIterator theNonAcademicTranslatorOfIterator = (NonAcademicTranslatorOfIterator)findAncestorWithClass(this, NonAcademicTranslatorOfIterator.class);
			pageContext.getOut().print(theNonAcademicTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

