package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryPublisherIterator theterritoryPublisherIterator = (territoryPublisherIterator)findAncestorWithClass(this, territoryPublisherIterator.class);
			pageContext.getOut().print(theterritoryPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for publisher tag ");
		}
		return SKIP_BODY;
	}
}

