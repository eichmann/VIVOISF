package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasAddressIterator theCollectionHasAddressIterator = (CollectionHasAddressIterator)findAncestorWithClass(this, CollectionHasAddressIterator.class);
			pageContext.getOut().print(theCollectionHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

