package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentProducerInverseIterator theGraduateStudentProducerInverseIterator = (GraduateStudentProducerInverseIterator)findAncestorWithClass(this, GraduateStudentProducerInverseIterator.class);
			pageContext.getOut().print(theGraduateStudentProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for producer tag ");
		}
		return SKIP_BODY;
	}
}

