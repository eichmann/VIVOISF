package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentRecipientInverseIterator theGraduateStudentRecipientInverseIterator = (GraduateStudentRecipientInverseIterator)findAncestorWithClass(this, GraduateStudentRecipientInverseIterator.class);
			pageContext.getOut().print(theGraduateStudentRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for recipient tag ");
		}
		return SKIP_BODY;
	}
}

