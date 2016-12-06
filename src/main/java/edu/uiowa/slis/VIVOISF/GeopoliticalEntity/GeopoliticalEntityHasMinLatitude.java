package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityHasMinLatitudeIterator theGeopoliticalEntity = (GeopoliticalEntityHasMinLatitudeIterator)findAncestorWithClass(this, GeopoliticalEntityHasMinLatitudeIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

