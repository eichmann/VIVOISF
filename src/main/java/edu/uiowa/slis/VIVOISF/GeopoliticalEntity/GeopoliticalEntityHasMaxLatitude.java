package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityHasMaxLatitudeIterator theGeopoliticalEntity = (GeopoliticalEntityHasMaxLatitudeIterator)findAncestorWithClass(this, GeopoliticalEntityHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

