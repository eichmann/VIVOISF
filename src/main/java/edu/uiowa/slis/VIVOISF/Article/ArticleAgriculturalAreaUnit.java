package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleAgriculturalAreaUnitIterator theArticle = (ArticleAgriculturalAreaUnitIterator)findAncestorWithClass(this, ArticleAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theArticle.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

