package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleVolumeIterator theArticle = (ArticleVolumeIterator)findAncestorWithClass(this, ArticleVolumeIterator.class);
			pageContext.getOut().print(theArticle.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for volume tag ");
		}
		return SKIP_BODY;
	}
}

