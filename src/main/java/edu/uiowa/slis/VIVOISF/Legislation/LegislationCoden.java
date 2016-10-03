package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationCodenIterator theLegislation = (LegislationCodenIterator)findAncestorWithClass(this, LegislationCodenIterator.class);
			pageContext.getOut().print(theLegislation.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for coden tag ");
		}
		return SKIP_BODY;
	}
}

