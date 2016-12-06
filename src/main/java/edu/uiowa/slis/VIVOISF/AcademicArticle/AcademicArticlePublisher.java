package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticlePublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticlePublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticlePublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticlePublisherIterator theAcademicArticlePublisherIterator = (AcademicArticlePublisherIterator)findAncestorWithClass(this, AcademicArticlePublisherIterator.class);
			pageContext.getOut().print(theAcademicArticlePublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for publisher tag ");
		}
		return SKIP_BODY;
	}
}

