package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionPublisherIterator theCollectionPublisherIterator = (CollectionPublisherIterator)findAncestorWithClass(this, CollectionPublisherIterator.class);
			pageContext.getOut().print(theCollectionPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for publisher tag ");
		}
		return SKIP_BODY;
	}
}

