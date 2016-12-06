package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingSource extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingSource currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingSource.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingSourceIterator theThing = (ThingSourceIterator)findAncestorWithClass(this, ThingSourceIterator.class);
			pageContext.getOut().print(theThing.getSource());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for source tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for source tag ");
		}
		return SKIP_BODY;
	}
}

