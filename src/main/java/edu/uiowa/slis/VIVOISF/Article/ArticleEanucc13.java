package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleEanucc13Iterator theArticle = (ArticleEanucc13Iterator)findAncestorWithClass(this, ArticleEanucc13Iterator.class);
			pageContext.getOut().print(theArticle.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

