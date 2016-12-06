package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityLandAreaYearIterator theGeopoliticalEntity = (GeopoliticalEntityLandAreaYearIterator)findAncestorWithClass(this, GeopoliticalEntityLandAreaYearIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

