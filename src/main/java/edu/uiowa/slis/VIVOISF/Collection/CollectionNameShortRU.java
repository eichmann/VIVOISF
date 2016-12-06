package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameShortRUIterator theCollection = (CollectionNameShortRUIterator)findAncestorWithClass(this, CollectionNameShortRUIterator.class);
			pageContext.getOut().print(theCollection.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

