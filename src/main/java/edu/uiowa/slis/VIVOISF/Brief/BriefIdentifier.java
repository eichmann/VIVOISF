package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefIdentifierIterator theBrief = (BriefIdentifierIterator)findAncestorWithClass(this, BriefIdentifierIterator.class);
			pageContext.getOut().print(theBrief.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for identifier tag ");
		}
		return SKIP_BODY;
	}
}

