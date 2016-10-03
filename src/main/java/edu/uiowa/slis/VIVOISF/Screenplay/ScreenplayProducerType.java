package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayProducerIterator theScreenplayProducerIterator = (ScreenplayProducerIterator)findAncestorWithClass(this, ScreenplayProducerIterator.class);
			pageContext.getOut().print(theScreenplayProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for producer tag ");
		}
		return SKIP_BODY;
	}
}

