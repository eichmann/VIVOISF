package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StudentFreetextKeywordIterator theStudent = (StudentFreetextKeywordIterator)findAncestorWithClass(this, StudentFreetextKeywordIterator.class);
			pageContext.getOut().print(theStudent.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

