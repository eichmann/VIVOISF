package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityHasMinLongitudeIterator theGeopoliticalEntity = (GeopoliticalEntityHasMinLongitudeIterator)findAncestorWithClass(this, GeopoliticalEntityHasMinLongitudeIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

