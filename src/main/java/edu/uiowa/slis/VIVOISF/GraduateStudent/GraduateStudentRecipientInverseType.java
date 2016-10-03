package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentRecipientInverseIterator theGraduateStudentRecipientInverseIterator = (GraduateStudentRecipientInverseIterator)findAncestorWithClass(this, GraduateStudentRecipientInverseIterator.class);
			pageContext.getOut().print(theGraduateStudentRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for recipient tag ");
		}
		return SKIP_BODY;
	}
}

