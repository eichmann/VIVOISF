package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationEditionIterator theLegislation = (LegislationEditionIterator)findAncestorWithClass(this, LegislationEditionIterator.class);
			pageContext.getOut().print(theLegislation.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for edition tag ");
		}
		return SKIP_BODY;
	}
}

