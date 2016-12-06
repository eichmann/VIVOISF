package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryRelatesIterator theterritoryRelatesIterator = (territoryRelatesIterator)findAncestorWithClass(this, territoryRelatesIterator.class);
			pageContext.getOut().print(theterritoryRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for relates tag ");
		}
		return SKIP_BODY;
	}
}

