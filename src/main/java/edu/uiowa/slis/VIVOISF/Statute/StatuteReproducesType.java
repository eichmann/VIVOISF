package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteReproducesIterator theStatuteReproducesIterator = (StatuteReproducesIterator)findAncestorWithClass(this, StatuteReproducesIterator.class);
			pageContext.getOut().print(theStatuteReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

