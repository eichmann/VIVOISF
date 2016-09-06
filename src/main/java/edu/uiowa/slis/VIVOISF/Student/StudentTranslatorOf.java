package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentTranslatorOfIterator theStudentTranslatorOfIterator = (StudentTranslatorOfIterator)findAncestorWithClass(this, StudentTranslatorOfIterator.class);
			pageContext.getOut().print(theStudentTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

