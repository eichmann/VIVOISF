package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingUrlIterator theThing = (ThingUrlIterator)findAncestorWithClass(this, ThingUrlIterator.class);
			pageContext.getOut().print(theThing.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for url tag ");
		}
		return SKIP_BODY;
	}
}

