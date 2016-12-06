package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHasMaxLatitudeIterator theAcademicArticle = (AcademicArticleHasMaxLatitudeIterator)findAncestorWithClass(this, AcademicArticleHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theAcademicArticle.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

