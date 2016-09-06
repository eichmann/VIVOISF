package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationReproducedInIterator theLegislationReproducedInIterator = (LegislationReproducedInIterator)findAncestorWithClass(this, LegislationReproducedInIterator.class);
			pageContext.getOut().print(theLegislationReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

