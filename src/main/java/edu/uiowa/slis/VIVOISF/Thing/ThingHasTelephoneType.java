package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingHasTelephoneIterator theThingHasTelephoneIterator = (ThingHasTelephoneIterator)findAncestorWithClass(this, ThingHasTelephoneIterator.class);
			pageContext.getOut().print(theThingHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

