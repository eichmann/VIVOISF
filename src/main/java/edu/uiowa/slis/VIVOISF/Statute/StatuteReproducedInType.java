package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteReproducedInIterator theStatuteReproducedInIterator = (StatuteReproducedInIterator)findAncestorWithClass(this, StatuteReproducedInIterator.class);
			pageContext.getOut().print(theStatuteReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

