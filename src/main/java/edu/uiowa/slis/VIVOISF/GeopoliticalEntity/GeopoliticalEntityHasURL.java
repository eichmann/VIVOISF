package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityHasURLIterator theGeopoliticalEntityHasURLIterator = (GeopoliticalEntityHasURLIterator)findAncestorWithClass(this, GeopoliticalEntityHasURLIterator.class);
			pageContext.getOut().print(theGeopoliticalEntityHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

