package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleProducerIterator theAcademicArticleProducerIterator = (AcademicArticleProducerIterator)findAncestorWithClass(this, AcademicArticleProducerIterator.class);
			pageContext.getOut().print(theAcademicArticleProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for producer tag ");
		}
		return SKIP_BODY;
	}
}

