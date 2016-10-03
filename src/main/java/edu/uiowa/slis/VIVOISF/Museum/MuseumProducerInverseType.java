package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumProducerInverseIterator theMuseumProducerInverseIterator = (MuseumProducerInverseIterator)findAncestorWithClass(this, MuseumProducerInverseIterator.class);
			pageContext.getOut().print(theMuseumProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for producer tag ");
		}
		return SKIP_BODY;
	}
}

