package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvincePublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvincePublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvincePublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvincePublisherIterator theStateOrProvincePublisherIterator = (StateOrProvincePublisherIterator)findAncestorWithClass(this, StateOrProvincePublisherIterator.class);
			pageContext.getOut().print(theStateOrProvincePublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for publisher tag ");
		}
		return SKIP_BODY;
	}
}

