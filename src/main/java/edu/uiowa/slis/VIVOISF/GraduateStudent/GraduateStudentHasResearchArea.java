package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentHasResearchAreaIterator theGraduateStudentHasResearchAreaIterator = (GraduateStudentHasResearchAreaIterator)findAncestorWithClass(this, GraduateStudentHasResearchAreaIterator.class);
			pageContext.getOut().print(theGraduateStudentHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

