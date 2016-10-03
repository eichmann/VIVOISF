package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationUri currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationUriIterator theLegislation = (LegislationUriIterator)findAncestorWithClass(this, LegislationUriIterator.class);
			pageContext.getOut().print(theLegislation.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for uri tag ");
		}
		return SKIP_BODY;
	}
}

