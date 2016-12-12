package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingIssn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingIssn currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingIssn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingIssnIterator theThing = (ThingIssnIterator)findAncestorWithClass(this, ThingIssnIterator.class);
			pageContext.getOut().print(theThing.getIssn());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for issn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for issn tag ");
		}
		return SKIP_BODY;
	}
}

