package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingIAO_0000115 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingIAO_0000115 currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingIAO_0000115.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingIAO_0000115Iterator theThing = (ThingIAO_0000115Iterator)findAncestorWithClass(this, ThingIAO_0000115Iterator.class);
			pageContext.getOut().print(theThing.getIAO_0000115());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for IAO_0000115 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for IAO_0000115 tag ");
		}
		return SKIP_BODY;
	}
}

