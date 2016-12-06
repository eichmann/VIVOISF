package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityDateTimeIntervalIterator theGeopoliticalEntityDateTimeIntervalIterator = (GeopoliticalEntityDateTimeIntervalIterator)findAncestorWithClass(this, GeopoliticalEntityDateTimeIntervalIterator.class);
			pageContext.getOut().print(theGeopoliticalEntityDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

