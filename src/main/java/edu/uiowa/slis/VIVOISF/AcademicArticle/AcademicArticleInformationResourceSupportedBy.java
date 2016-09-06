package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleInformationResourceSupportedByIterator theAcademicArticleInformationResourceSupportedByIterator = (AcademicArticleInformationResourceSupportedByIterator)findAncestorWithClass(this, AcademicArticleInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theAcademicArticleInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

