package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionPublisherIterator thePrimaryPositionPublisherIterator = (PrimaryPositionPublisherIterator)findAncestorWithClass(this, PrimaryPositionPublisherIterator.class);
			pageContext.getOut().print(thePrimaryPositionPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for publisher tag ");
		}
		return SKIP_BODY;
	}
}

