package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityLandAreaTotalIterator theGeopoliticalEntity = (GeopoliticalEntityLandAreaTotalIterator)findAncestorWithClass(this, GeopoliticalEntityLandAreaTotalIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

