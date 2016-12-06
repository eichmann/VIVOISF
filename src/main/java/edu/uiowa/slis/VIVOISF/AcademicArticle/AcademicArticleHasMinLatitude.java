package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHasMinLatitudeIterator theAcademicArticle = (AcademicArticleHasMinLatitudeIterator)findAncestorWithClass(this, AcademicArticleHasMinLatitudeIterator.class);
			pageContext.getOut().print(theAcademicArticle.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

