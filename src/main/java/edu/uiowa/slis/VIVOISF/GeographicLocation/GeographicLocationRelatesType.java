package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationRelatesIterator theGeographicLocationRelatesIterator = (GeographicLocationRelatesIterator)findAncestorWithClass(this, GeographicLocationRelatesIterator.class);
			pageContext.getOut().print(theGeographicLocationRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for relates tag ");
		}
		return SKIP_BODY;
	}
}

