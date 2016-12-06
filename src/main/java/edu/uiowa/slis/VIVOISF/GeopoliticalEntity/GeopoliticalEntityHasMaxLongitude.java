package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityHasMaxLongitudeIterator theGeopoliticalEntity = (GeopoliticalEntityHasMaxLongitudeIterator)findAncestorWithClass(this, GeopoliticalEntityHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

