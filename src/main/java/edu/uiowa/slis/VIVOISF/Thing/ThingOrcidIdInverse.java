package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingOrcidIdInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingOrcidIdInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingOrcidIdInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingOrcidIdInverseIterator theThingOrcidIdInverseIterator = (ThingOrcidIdInverseIterator)findAncestorWithClass(this, ThingOrcidIdInverseIterator.class);
			pageContext.getOut().print(theThingOrcidIdInverseIterator.getOrcidIdInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

