package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceIdentifierIterator theReferenceSource = (ReferenceSourceIdentifierIterator)findAncestorWithClass(this, ReferenceSourceIdentifierIterator.class);
			pageContext.getOut().print(theReferenceSource.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for identifier tag ");
		}
		return SKIP_BODY;
	}
}

