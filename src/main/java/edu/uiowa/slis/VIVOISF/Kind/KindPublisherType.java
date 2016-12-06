package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(KindPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindPublisherIterator theKindPublisherIterator = (KindPublisherIterator)findAncestorWithClass(this, KindPublisherIterator.class);
			pageContext.getOut().print(theKindPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for publisher tag ");
		}
		return SKIP_BODY;
	}
}

