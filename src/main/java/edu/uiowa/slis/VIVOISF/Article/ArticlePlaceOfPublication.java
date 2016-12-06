package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticlePlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticlePlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticlePlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Article theArticle = (Article)findAncestorWithClass(this, Article.class);
			if (!theArticle.commitNeeded) {
				pageContext.getOut().print(theArticle.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Article for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Article theArticle = (Article)findAncestorWithClass(this, Article.class);
			return theArticle.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Article for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Article theArticle = (Article)findAncestorWithClass(this, Article.class);
			theArticle.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Article for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for placeOfPublication tag ");
		}
	}
}

