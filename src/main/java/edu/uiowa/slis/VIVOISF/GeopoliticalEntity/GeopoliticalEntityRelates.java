package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityRelatesIterator theGeopoliticalEntityRelatesIterator = (GeopoliticalEntityRelatesIterator)findAncestorWithClass(this, GeopoliticalEntityRelatesIterator.class);
			pageContext.getOut().print(theGeopoliticalEntityRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for relates tag ");
		}
		return SKIP_BODY;
	}
}

