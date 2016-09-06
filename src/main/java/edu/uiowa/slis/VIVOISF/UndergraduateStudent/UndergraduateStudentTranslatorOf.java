package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentTranslatorOfIterator theUndergraduateStudentTranslatorOfIterator = (UndergraduateStudentTranslatorOfIterator)findAncestorWithClass(this, UndergraduateStudentTranslatorOfIterator.class);
			pageContext.getOut().print(theUndergraduateStudentTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

