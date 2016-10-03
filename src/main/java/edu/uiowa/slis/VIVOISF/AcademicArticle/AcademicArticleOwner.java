package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleOwnerIterator theAcademicArticleOwnerIterator = (AcademicArticleOwnerIterator)findAncestorWithClass(this, AcademicArticleOwnerIterator.class);
			pageContext.getOut().print(theAcademicArticleOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for owner tag ");
		}
		return SKIP_BODY;
	}
}

