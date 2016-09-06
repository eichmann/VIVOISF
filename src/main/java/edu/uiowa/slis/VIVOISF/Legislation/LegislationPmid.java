package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationPmidIterator theLegislation = (LegislationPmidIterator)findAncestorWithClass(this, LegislationPmidIterator.class);
			pageContext.getOut().print(theLegislation.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for pmid tag ");
		}
		return SKIP_BODY;
	}
}

