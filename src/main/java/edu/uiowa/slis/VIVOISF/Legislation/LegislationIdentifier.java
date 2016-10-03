package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationIdentifierIterator theLegislation = (LegislationIdentifierIterator)findAncestorWithClass(this, LegislationIdentifierIterator.class);
			pageContext.getOut().print(theLegislation.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for identifier tag ");
		}
		return SKIP_BODY;
	}
}

