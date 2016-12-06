package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentPublisherIterator theContinentPublisherIterator = (ContinentPublisherIterator)findAncestorWithClass(this, ContinentPublisherIterator.class);
			pageContext.getOut().print(theContinentPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for publisher tag ");
		}
		return SKIP_BODY;
	}
}

