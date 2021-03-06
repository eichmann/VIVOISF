package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingHDITotalIterator theThing = (ThingHDITotalIterator)findAncestorWithClass(this, ThingHDITotalIterator.class);
			pageContext.getOut().print(theThing.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

