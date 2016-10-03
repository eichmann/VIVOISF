package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleTranscriptOfIterator theEditorialArticleTranscriptOfIterator = (EditorialArticleTranscriptOfIterator)findAncestorWithClass(this, EditorialArticleTranscriptOfIterator.class);
			pageContext.getOut().print(theEditorialArticleTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

