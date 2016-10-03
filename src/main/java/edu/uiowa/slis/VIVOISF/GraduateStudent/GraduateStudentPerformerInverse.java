package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentPerformerInverseIterator theGraduateStudentPerformerInverseIterator = (GraduateStudentPerformerInverseIterator)findAncestorWithClass(this, GraduateStudentPerformerInverseIterator.class);
			pageContext.getOut().print(theGraduateStudentPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for performer tag ");
		}
		return SKIP_BODY;
	}
}

