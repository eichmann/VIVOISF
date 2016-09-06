package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicTranslatorOfIterator theNonAcademicTranslatorOfIterator = (NonAcademicTranslatorOfIterator)findAncestorWithClass(this, NonAcademicTranslatorOfIterator.class);
			pageContext.getOut().print(theNonAcademicTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

