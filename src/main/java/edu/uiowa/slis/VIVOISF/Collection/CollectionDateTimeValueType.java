package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionDateTimeValueIterator theCollectionDateTimeValueIterator = (CollectionDateTimeValueIterator)findAncestorWithClass(this, CollectionDateTimeValueIterator.class);
			pageContext.getOut().print(theCollectionDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

