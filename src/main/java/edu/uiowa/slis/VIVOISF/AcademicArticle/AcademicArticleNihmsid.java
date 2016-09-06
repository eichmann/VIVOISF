package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNihmsid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNihmsid currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNihmsid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNihmsidIterator theAcademicArticle = (AcademicArticleNihmsidIterator)findAncestorWithClass(this, AcademicArticleNihmsidIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNihmsid());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nihmsid tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nihmsid tag ");
		}
		return SKIP_BODY;
	}
}

