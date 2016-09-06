package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionRelatesIterator thePrimaryPositionRelatesIterator = (PrimaryPositionRelatesIterator)findAncestorWithClass(this, PrimaryPositionRelatesIterator.class);
			pageContext.getOut().print(thePrimaryPositionRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for relates tag ");
		}
		return SKIP_BODY;
	}
}

