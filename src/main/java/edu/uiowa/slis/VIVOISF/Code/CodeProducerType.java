package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeProducerIterator theCodeProducerIterator = (CodeProducerIterator)findAncestorWithClass(this, CodeProducerIterator.class);
			pageContext.getOut().print(theCodeProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for producer tag ");
		}
		return SKIP_BODY;
	}
}

