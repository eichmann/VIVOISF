package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocProducerInverseIterator thePostdocProducerInverseIterator = (PostdocProducerInverseIterator)findAncestorWithClass(this, PostdocProducerInverseIterator.class);
			pageContext.getOut().print(thePostdocProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for producer tag ");
		}
		return SKIP_BODY;
	}
}

