package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineProducerIterator theMagazineProducerIterator = (MagazineProducerIterator)findAncestorWithClass(this, MagazineProducerIterator.class);
			pageContext.getOut().print(theMagazineProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for producer tag ");
		}
		return SKIP_BODY;
	}
}

