package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityCountryAreaYearIterator theGeopoliticalEntity = (GeopoliticalEntityCountryAreaYearIterator)findAncestorWithClass(this, GeopoliticalEntityCountryAreaYearIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

