package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingSourceModified extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingSourceModified currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingSourceModified.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingSourceModifiedIterator theThing = (ThingSourceModifiedIterator)findAncestorWithClass(this, ThingSourceModifiedIterator.class);
			pageContext.getOut().print(theThing.getSourceModified());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for sourceModified tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for sourceModified tag ");
		}
		return SKIP_BODY;
	}
}

