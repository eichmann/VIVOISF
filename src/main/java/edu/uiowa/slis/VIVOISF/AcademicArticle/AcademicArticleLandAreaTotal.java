package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleLandAreaTotalIterator theAcademicArticle = (AcademicArticleLandAreaTotalIterator)findAncestorWithClass(this, AcademicArticleLandAreaTotalIterator.class);
			pageContext.getOut().print(theAcademicArticle.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

