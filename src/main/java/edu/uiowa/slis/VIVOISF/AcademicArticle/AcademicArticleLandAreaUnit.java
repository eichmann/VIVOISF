package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleLandAreaUnitIterator theAcademicArticle = (AcademicArticleLandAreaUnitIterator)findAncestorWithClass(this, AcademicArticleLandAreaUnitIterator.class);
			pageContext.getOut().print(theAcademicArticle.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

