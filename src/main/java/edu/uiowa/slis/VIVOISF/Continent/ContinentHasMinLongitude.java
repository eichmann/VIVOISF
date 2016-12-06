package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentHasMinLongitudeIterator theContinent = (ContinentHasMinLongitudeIterator)findAncestorWithClass(this, ContinentHasMinLongitudeIterator.class);
			pageContext.getOut().print(theContinent.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

