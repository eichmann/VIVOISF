package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentFreetextKeywordIterator theUndergraduateStudent = (UndergraduateStudentFreetextKeywordIterator)findAncestorWithClass(this, UndergraduateStudentFreetextKeywordIterator.class);
			pageContext.getOut().print(theUndergraduateStudent.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

