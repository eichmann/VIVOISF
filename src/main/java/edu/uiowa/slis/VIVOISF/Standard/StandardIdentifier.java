package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardIdentifierIterator theStandard = (StandardIdentifierIterator)findAncestorWithClass(this, StandardIdentifierIterator.class);
			pageContext.getOut().print(theStandard.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for identifier tag ");
		}
		return SKIP_BODY;
	}
}

