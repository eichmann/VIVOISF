package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingPublisherIterator theself_governingPublisherIterator = (self_governingPublisherIterator)findAncestorWithClass(this, self_governingPublisherIterator.class);
			pageContext.getOut().print(theself_governingPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for publisher tag ");
		}
		return SKIP_BODY;
	}
}

