package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualProducerIterator theManualProducerIterator = (ManualProducerIterator)findAncestorWithClass(this, ManualProducerIterator.class);
			pageContext.getOut().print(theManualProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for producer tag ");
		}
		return SKIP_BODY;
	}
}

