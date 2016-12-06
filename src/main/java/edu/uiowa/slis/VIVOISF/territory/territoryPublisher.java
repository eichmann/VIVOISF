package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryPublisherIterator theterritoryPublisherIterator = (territoryPublisherIterator)findAncestorWithClass(this, territoryPublisherIterator.class);
			pageContext.getOut().print(theterritoryPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for publisher tag ");
		}
		return SKIP_BODY;
	}
}

