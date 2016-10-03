package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionProducerIterator theCollectionProducerIterator = (CollectionProducerIterator)findAncestorWithClass(this, CollectionProducerIterator.class);
			pageContext.getOut().print(theCollectionProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for producer tag ");
		}
		return SKIP_BODY;
	}
}

