package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameListESIterator theCollection = (CollectionNameListESIterator)findAncestorWithClass(this, CollectionNameListESIterator.class);
			pageContext.getOut().print(theCollection.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

