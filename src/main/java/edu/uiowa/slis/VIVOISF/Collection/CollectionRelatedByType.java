package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionRelatedByIterator theCollectionRelatedByIterator = (CollectionRelatedByIterator)findAncestorWithClass(this, CollectionRelatedByIterator.class);
			pageContext.getOut().print(theCollectionRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

