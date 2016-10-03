package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionIsbn10Iterator theCollection = (CollectionIsbn10Iterator)findAncestorWithClass(this, CollectionIsbn10Iterator.class);
			pageContext.getOut().print(theCollection.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

