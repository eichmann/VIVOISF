package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNumberIterator theAcademicArticle = (AcademicArticleNumberIterator)findAncestorWithClass(this, AcademicArticleNumberIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for number tag ");
		}
		return SKIP_BODY;
	}
}

