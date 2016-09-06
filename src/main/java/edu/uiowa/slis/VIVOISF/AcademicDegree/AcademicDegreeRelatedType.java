package edu.uiowa.slis.VIVOISF.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeRelatedType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDegreeRelatedType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeRelatedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDegreeRelatedIterator theAcademicDegreeRelatedIterator = (AcademicDegreeRelatedIterator)findAncestorWithClass(this, AcademicDegreeRelatedIterator.class);
			pageContext.getOut().print(theAcademicDegreeRelatedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for related tag ");
		}
		return SKIP_BODY;
	}
}

