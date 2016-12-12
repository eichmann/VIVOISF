package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaSourceIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaSourceIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaSourceIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaSourceIdentifierIterator theArea = (AreaSourceIdentifierIterator)findAncestorWithClass(this, AreaSourceIdentifierIterator.class);
			pageContext.getOut().print(theArea.getSourceIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for sourceIdentifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for sourceIdentifier tag ");
		}
		return SKIP_BODY;
	}
}

