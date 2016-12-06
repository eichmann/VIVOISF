package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameOfficialARIterator theArticle = (ArticleNameOfficialARIterator)findAncestorWithClass(this, ArticleNameOfficialARIterator.class);
			pageContext.getOut().print(theArticle.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

