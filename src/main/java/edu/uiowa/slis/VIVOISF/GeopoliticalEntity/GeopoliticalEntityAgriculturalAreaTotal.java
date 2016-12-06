package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityAgriculturalAreaTotalIterator theGeopoliticalEntity = (GeopoliticalEntityAgriculturalAreaTotalIterator)findAncestorWithClass(this, GeopoliticalEntityAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

