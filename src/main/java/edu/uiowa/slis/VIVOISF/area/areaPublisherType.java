package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(areaPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaPublisherIterator theareaPublisherIterator = (areaPublisherIterator)findAncestorWithClass(this, areaPublisherIterator.class);
			pageContext.getOut().print(theareaPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for publisher tag ");
		}
		return SKIP_BODY;
	}
}

