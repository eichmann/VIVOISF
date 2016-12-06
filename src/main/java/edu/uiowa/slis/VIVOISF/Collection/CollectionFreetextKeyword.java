package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionFreetextKeywordIterator theCollection = (CollectionFreetextKeywordIterator)findAncestorWithClass(this, CollectionFreetextKeywordIterator.class);
			pageContext.getOut().print(theCollection.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

