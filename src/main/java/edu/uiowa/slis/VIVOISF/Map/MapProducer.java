package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(MapProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapProducerIterator theMapProducerIterator = (MapProducerIterator)findAncestorWithClass(this, MapProducerIterator.class);
			pageContext.getOut().print(theMapProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for producer tag ");
		}
		return SKIP_BODY;
	}
}

