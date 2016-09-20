package edu.uiowa.slis.VIVOISF.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeRelatedInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDegreeRelatedInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeRelatedInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDegreeRelatedInverseIterator theAcademicDegreeRelatedInverseIterator = (AcademicDegreeRelatedInverseIterator)findAncestorWithClass(this, AcademicDegreeRelatedInverseIterator.class);
			pageContext.getOut().print(theAcademicDegreeRelatedInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for related tag ");
		}
		return SKIP_BODY;
	}
}

