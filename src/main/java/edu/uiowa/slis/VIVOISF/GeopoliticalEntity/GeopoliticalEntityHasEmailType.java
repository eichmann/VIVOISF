package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityHasEmailIterator theGeopoliticalEntityHasEmailIterator = (GeopoliticalEntityHasEmailIterator)findAncestorWithClass(this, GeopoliticalEntityHasEmailIterator.class);
			pageContext.getOut().print(theGeopoliticalEntityHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

