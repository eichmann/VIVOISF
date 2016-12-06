package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleBFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleBFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleBFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleBFO_0000051Iterator theArticleBFO_0000051Iterator = (ArticleBFO_0000051Iterator)findAncestorWithClass(this, ArticleBFO_0000051Iterator.class);
			pageContext.getOut().print(theArticleBFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

