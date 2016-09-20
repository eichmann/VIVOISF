package edu.uiowa.slis.VIVOISF.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeRelatedInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDegreeRelatedInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeRelatedInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDegreeRelatedInverseIterator theAcademicDegreeRelatedInverseIterator = (AcademicDegreeRelatedInverseIterator)findAncestorWithClass(this, AcademicDegreeRelatedInverseIterator.class);
			pageContext.getOut().print(theAcademicDegreeRelatedInverseIterator.getRelatedInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for related tag ");
		}
		return SKIP_BODY;
	}
}

