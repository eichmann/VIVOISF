package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionProducerIterator theCollectionProducerIterator = (CollectionProducerIterator)findAncestorWithClass(this, CollectionProducerIterator.class);
			pageContext.getOut().print(theCollectionProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for producer tag ");
		}
		return SKIP_BODY;
	}
}

