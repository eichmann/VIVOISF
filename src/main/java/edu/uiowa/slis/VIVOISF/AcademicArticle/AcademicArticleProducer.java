package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleProducerIterator theAcademicArticleProducerIterator = (AcademicArticleProducerIterator)findAncestorWithClass(this, AcademicArticleProducerIterator.class);
			pageContext.getOut().print(theAcademicArticleProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for producer tag ");
		}
		return SKIP_BODY;
	}
}

