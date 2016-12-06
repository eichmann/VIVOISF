package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasNameIterator theCollectionHasNameIterator = (CollectionHasNameIterator)findAncestorWithClass(this, CollectionHasNameIterator.class);
			pageContext.getOut().print(theCollectionHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasName tag ");
		}
		return SKIP_BODY;
	}
}

