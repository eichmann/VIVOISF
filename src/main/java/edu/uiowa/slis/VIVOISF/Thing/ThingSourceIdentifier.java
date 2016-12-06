package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingSourceIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingSourceIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingSourceIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingSourceIdentifierIterator theThing = (ThingSourceIdentifierIterator)findAncestorWithClass(this, ThingSourceIdentifierIterator.class);
			pageContext.getOut().print(theThing.getSourceIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for sourceIdentifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for sourceIdentifier tag ");
		}
		return SKIP_BODY;
	}
}

