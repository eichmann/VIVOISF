package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleOclcnumIterator theArticle = (ArticleOclcnumIterator)findAncestorWithClass(this, ArticleOclcnumIterator.class);
			pageContext.getOut().print(theArticle.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

