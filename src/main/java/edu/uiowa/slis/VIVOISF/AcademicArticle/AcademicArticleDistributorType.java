package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleDistributorIterator theAcademicArticleDistributorIterator = (AcademicArticleDistributorIterator)findAncestorWithClass(this, AcademicArticleDistributorIterator.class);
			pageContext.getOut().print(theAcademicArticleDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for distributor tag ");
		}
		return SKIP_BODY;
	}
}

