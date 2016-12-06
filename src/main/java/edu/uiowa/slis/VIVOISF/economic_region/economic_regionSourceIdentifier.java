package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionSourceIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionSourceIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionSourceIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionSourceIdentifierIterator theeconomic_region = (economic_regionSourceIdentifierIterator)findAncestorWithClass(this, economic_regionSourceIdentifierIterator.class);
			pageContext.getOut().print(theeconomic_region.getSourceIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for sourceIdentifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for sourceIdentifier tag ");
		}
		return SKIP_BODY;
	}
}

