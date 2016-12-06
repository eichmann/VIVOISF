package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009PublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009PublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009PublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009PublisherIterator theIAO_0000009PublisherIterator = (IAO_0000009PublisherIterator)findAncestorWithClass(this, IAO_0000009PublisherIterator.class);
			pageContext.getOut().print(theIAO_0000009PublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for publisher tag ");
		}
		return SKIP_BODY;
	}
}

