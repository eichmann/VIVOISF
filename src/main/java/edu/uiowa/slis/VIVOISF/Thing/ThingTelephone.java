package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingTelephone.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingTelephoneIterator theThing = (ThingTelephoneIterator)findAncestorWithClass(this, ThingTelephoneIterator.class);
			pageContext.getOut().print(theThing.getTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for telephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for telephone tag ");
		}
		return SKIP_BODY;
	}
}

