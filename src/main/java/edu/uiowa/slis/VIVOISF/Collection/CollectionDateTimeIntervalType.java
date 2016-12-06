package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionDateTimeIntervalIterator theCollectionDateTimeIntervalIterator = (CollectionDateTimeIntervalIterator)findAncestorWithClass(this, CollectionDateTimeIntervalIterator.class);
			pageContext.getOut().print(theCollectionDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

