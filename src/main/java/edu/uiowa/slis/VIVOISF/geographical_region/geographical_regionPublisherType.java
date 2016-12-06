package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionPublisherIterator thegeographical_regionPublisherIterator = (geographical_regionPublisherIterator)findAncestorWithClass(this, geographical_regionPublisherIterator.class);
			pageContext.getOut().print(thegeographical_regionPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for publisher tag ");
		}
		return SKIP_BODY;
	}
}
