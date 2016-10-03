package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionIdentifierIterator theCollection = (CollectionIdentifierIterator)findAncestorWithClass(this, CollectionIdentifierIterator.class);
			pageContext.getOut().print(theCollection.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for identifier tag ");
		}
		return SKIP_BODY;
	}
}

