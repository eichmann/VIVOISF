package edu.uiowa.slis.VIVOISF.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeSubjectAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDegreeSubjectAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeSubjectAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDegreeSubjectAreaOfIterator theAcademicDegreeSubjectAreaOfIterator = (AcademicDegreeSubjectAreaOfIterator)findAncestorWithClass(this, AcademicDegreeSubjectAreaOfIterator.class);
			pageContext.getOut().print(theAcademicDegreeSubjectAreaOfIterator.getSubjectAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for subjectAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for subjectAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

