package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentTranslatorOfIterator theGraduateStudentTranslatorOfIterator = (GraduateStudentTranslatorOfIterator)findAncestorWithClass(this, GraduateStudentTranslatorOfIterator.class);
			pageContext.getOut().print(theGraduateStudentTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

