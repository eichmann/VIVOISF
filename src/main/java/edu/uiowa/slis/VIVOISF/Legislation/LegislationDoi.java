package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationDoiIterator theLegislation = (LegislationDoiIterator)findAncestorWithClass(this, LegislationDoiIterator.class);
			pageContext.getOut().print(theLegislation.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for doi tag ");
		}
		return SKIP_BODY;
	}
}

