package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityDateTimeValueIterator theGeopoliticalEntityDateTimeValueIterator = (GeopoliticalEntityDateTimeValueIterator)findAncestorWithClass(this, GeopoliticalEntityDateTimeValueIterator.class);
			pageContext.getOut().print(theGeopoliticalEntityDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

