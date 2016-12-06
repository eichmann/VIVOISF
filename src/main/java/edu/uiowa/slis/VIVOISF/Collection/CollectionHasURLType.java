package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasURLIterator theCollectionHasURLIterator = (CollectionHasURLIterator)findAncestorWithClass(this, CollectionHasURLIterator.class);
			pageContext.getOut().print(theCollectionHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasURL tag ");
		}
		return SKIP_BODY;
	}
}
