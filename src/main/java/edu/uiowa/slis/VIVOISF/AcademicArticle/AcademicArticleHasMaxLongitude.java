package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHasMaxLongitudeIterator theAcademicArticle = (AcademicArticleHasMaxLongitudeIterator)findAncestorWithClass(this, AcademicArticleHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theAcademicArticle.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

