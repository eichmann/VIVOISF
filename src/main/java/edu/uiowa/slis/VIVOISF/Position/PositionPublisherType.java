package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionPublisherIterator thePositionPublisherIterator = (PositionPublisherIterator)findAncestorWithClass(this, PositionPublisherIterator.class);
			pageContext.getOut().print(thePositionPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for publisher tag ");
		}
		return SKIP_BODY;
	}
}

