package edu.uiowa.slis.VIVOISF.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDegreeDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicDegreeDescriptionIterator theAcademicDegree = (AcademicDegreeDescriptionIterator)findAncestorWithClass(this, AcademicDegreeDescriptionIterator.class);
			pageContext.getOut().print(theAcademicDegree.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for description tag ");
		}
		return SKIP_BODY;
	}
}

