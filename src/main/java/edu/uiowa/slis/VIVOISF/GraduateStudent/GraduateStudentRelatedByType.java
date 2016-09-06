package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentRelatedByIterator theGraduateStudentRelatedByIterator = (GraduateStudentRelatedByIterator)findAncestorWithClass(this, GraduateStudentRelatedByIterator.class);
			pageContext.getOut().print(theGraduateStudentRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

