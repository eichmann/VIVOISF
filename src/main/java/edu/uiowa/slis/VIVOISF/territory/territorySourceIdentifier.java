package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territorySourceIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territorySourceIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(territorySourceIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territorySourceIdentifierIterator theterritory = (territorySourceIdentifierIterator)findAncestorWithClass(this, territorySourceIdentifierIterator.class);
			pageContext.getOut().print(theterritory.getSourceIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for sourceIdentifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for sourceIdentifier tag ");
		}
		return SKIP_BODY;
	}
}

