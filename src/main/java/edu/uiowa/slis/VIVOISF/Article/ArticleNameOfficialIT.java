package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameOfficialITIterator theArticle = (ArticleNameOfficialITIterator)findAncestorWithClass(this, ArticleNameOfficialITIterator.class);
			pageContext.getOut().print(theArticle.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

