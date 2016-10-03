package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentPerformerInverseIterator theGraduateStudentPerformerInverseIterator = (GraduateStudentPerformerInverseIterator)findAncestorWithClass(this, GraduateStudentPerformerInverseIterator.class);
			pageContext.getOut().print(theGraduateStudentPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for performer tag ");
		}
		return SKIP_BODY;
	}
}

