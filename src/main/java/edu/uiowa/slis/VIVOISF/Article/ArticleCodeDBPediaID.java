package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleCodeDBPediaIDIterator theArticle = (ArticleCodeDBPediaIDIterator)findAncestorWithClass(this, ArticleCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theArticle.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

