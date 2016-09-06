package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionRelatesIterator thePositionRelatesIterator = (PositionRelatesIterator)findAncestorWithClass(this, PositionRelatesIterator.class);
			pageContext.getOut().print(thePositionRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for relates tag ");
		}
		return SKIP_BODY;
	}
}

