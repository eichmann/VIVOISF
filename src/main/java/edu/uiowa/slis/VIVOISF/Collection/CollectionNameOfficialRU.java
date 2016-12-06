package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameOfficialRUIterator theCollection = (CollectionNameOfficialRUIterator)findAncestorWithClass(this, CollectionNameOfficialRUIterator.class);
			pageContext.getOut().print(theCollection.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

