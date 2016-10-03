package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentOwnerInverseIterator theGraduateStudentOwnerInverseIterator = (GraduateStudentOwnerInverseIterator)findAncestorWithClass(this, GraduateStudentOwnerInverseIterator.class);
			pageContext.getOut().print(theGraduateStudentOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for owner tag ");
		}
		return SKIP_BODY;
	}
}

