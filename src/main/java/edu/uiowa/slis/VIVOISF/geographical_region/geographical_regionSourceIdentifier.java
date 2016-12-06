package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionSourceIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionSourceIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionSourceIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionSourceIdentifierIterator thegeographical_region = (geographical_regionSourceIdentifierIterator)findAncestorWithClass(this, geographical_regionSourceIdentifierIterator.class);
			pageContext.getOut().print(thegeographical_region.getSourceIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for sourceIdentifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for sourceIdentifier tag ");
		}
		return SKIP_BODY;
	}
}

