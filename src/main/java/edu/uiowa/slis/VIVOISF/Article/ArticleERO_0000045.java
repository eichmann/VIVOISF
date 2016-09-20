package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleERO_0000045Iterator theArticle = (ArticleERO_0000045Iterator)findAncestorWithClass(this, ArticleERO_0000045Iterator.class);
			pageContext.getOut().print(theArticle.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

