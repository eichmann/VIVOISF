package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHasMinLongitudeIterator theAcademicArticle = (AcademicArticleHasMinLongitudeIterator)findAncestorWithClass(this, AcademicArticleHasMinLongitudeIterator.class);
			pageContext.getOut().print(theAcademicArticle.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

