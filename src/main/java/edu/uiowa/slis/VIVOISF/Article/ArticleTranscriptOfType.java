package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleTranscriptOfIterator theArticleTranscriptOfIterator = (ArticleTranscriptOfIterator)findAncestorWithClass(this, ArticleTranscriptOfIterator.class);
			pageContext.getOut().print(theArticleTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

