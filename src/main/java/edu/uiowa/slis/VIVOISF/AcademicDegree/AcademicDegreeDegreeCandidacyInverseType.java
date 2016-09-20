package edu.uiowa.slis.VIVOISF.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeDegreeCandidacyInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDegreeDegreeCandidacyInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeDegreeCandidacyInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDegreeDegreeCandidacyInverseIterator theAcademicDegreeDegreeCandidacyInverseIterator = (AcademicDegreeDegreeCandidacyInverseIterator)findAncestorWithClass(this, AcademicDegreeDegreeCandidacyInverseIterator.class);
			pageContext.getOut().print(theAcademicDegreeDegreeCandidacyInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for degreeCandidacy tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for degreeCandidacy tag ");
		}
		return SKIP_BODY;
	}
}

