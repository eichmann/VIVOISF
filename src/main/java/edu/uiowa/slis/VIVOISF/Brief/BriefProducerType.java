package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefProducerIterator theBriefProducerIterator = (BriefProducerIterator)findAncestorWithClass(this, BriefProducerIterator.class);
			pageContext.getOut().print(theBriefProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for producer tag ");
		}
		return SKIP_BODY;
	}
}

