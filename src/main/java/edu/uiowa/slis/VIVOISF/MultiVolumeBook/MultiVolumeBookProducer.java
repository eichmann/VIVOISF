package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookProducerIterator theMultiVolumeBookProducerIterator = (MultiVolumeBookProducerIterator)findAncestorWithClass(this, MultiVolumeBookProducerIterator.class);
			pageContext.getOut().print(theMultiVolumeBookProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for producer tag ");
		}
		return SKIP_BODY;
	}
}

