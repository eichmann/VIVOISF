package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasAddressIterator theCollectionHasAddressIterator = (CollectionHasAddressIterator)findAncestorWithClass(this, CollectionHasAddressIterator.class);
			pageContext.getOut().print(theCollectionHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

