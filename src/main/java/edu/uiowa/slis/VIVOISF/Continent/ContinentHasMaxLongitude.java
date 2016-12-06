package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentHasMaxLongitudeIterator theContinent = (ContinentHasMaxLongitudeIterator)findAncestorWithClass(this, ContinentHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theContinent.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

