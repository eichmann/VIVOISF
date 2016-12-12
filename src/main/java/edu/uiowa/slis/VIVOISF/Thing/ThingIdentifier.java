package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingIdentifierIterator theThing = (ThingIdentifierIterator)findAncestorWithClass(this, ThingIdentifierIterator.class);
			pageContext.getOut().print(theThing.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for identifier tag ");
		}
		return SKIP_BODY;
	}
}

