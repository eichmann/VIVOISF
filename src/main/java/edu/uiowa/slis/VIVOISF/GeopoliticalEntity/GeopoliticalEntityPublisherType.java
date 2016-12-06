package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityPublisherIterator theGeopoliticalEntityPublisherIterator = (GeopoliticalEntityPublisherIterator)findAncestorWithClass(this, GeopoliticalEntityPublisherIterator.class);
			pageContext.getOut().print(theGeopoliticalEntityPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for publisher tag ");
		}
		return SKIP_BODY;
	}
}

