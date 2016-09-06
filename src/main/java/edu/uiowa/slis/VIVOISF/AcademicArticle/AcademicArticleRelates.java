package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleRelatesIterator theAcademicArticleRelatesIterator = (AcademicArticleRelatesIterator)findAncestorWithClass(this, AcademicArticleRelatesIterator.class);
			pageContext.getOut().print(theAcademicArticleRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for relates tag ");
		}
		return SKIP_BODY;
	}
}

