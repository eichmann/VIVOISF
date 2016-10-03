package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleEditionIterator theAcademicArticle = (AcademicArticleEditionIterator)findAncestorWithClass(this, AcademicArticleEditionIterator.class);
			pageContext.getOut().print(theAcademicArticle.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for edition tag ");
		}
		return SKIP_BODY;
	}
}

