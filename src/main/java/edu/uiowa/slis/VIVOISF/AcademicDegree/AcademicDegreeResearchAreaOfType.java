package edu.uiowa.slis.VIVOISF.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeResearchAreaOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDegreeResearchAreaOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeResearchAreaOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDegreeResearchAreaOfIterator theAcademicDegreeResearchAreaOfIterator = (AcademicDegreeResearchAreaOfIterator)findAncestorWithClass(this, AcademicDegreeResearchAreaOfIterator.class);
			pageContext.getOut().print(theAcademicDegreeResearchAreaOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

