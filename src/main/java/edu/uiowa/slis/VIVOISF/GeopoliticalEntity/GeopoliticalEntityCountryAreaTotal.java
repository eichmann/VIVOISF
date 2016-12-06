package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityCountryAreaTotalIterator theGeopoliticalEntity = (GeopoliticalEntityCountryAreaTotalIterator)findAncestorWithClass(this, GeopoliticalEntityCountryAreaTotalIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

