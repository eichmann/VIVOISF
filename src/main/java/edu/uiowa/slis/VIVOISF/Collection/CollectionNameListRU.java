package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameListRUIterator theCollection = (CollectionNameListRUIterator)findAncestorWithClass(this, CollectionNameListRUIterator.class);
			pageContext.getOut().print(theCollection.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

