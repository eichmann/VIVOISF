package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationLccnIterator theLegislation = (LegislationLccnIterator)findAncestorWithClass(this, LegislationLccnIterator.class);
			pageContext.getOut().print(theLegislation.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for lccn tag ");
		}
		return SKIP_BODY;
	}
}

